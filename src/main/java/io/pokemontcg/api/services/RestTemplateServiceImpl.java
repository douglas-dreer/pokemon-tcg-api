package io.pokemontcg.api.services;

import io.pokemontcg.api.enums.EndPointType;
import io.pokemontcg.api.exceptions.PokemonTradeCardGameException;
import io.pokemontcg.api.models.Params;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@Log4j2
public class RestTemplateServiceImpl extends RestTemplateService {

    private final RestTemplate restTemplate;
    @Value("${props.URL_BASE}")
    private String URL_BASE;

    public RestTemplateServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    private URI createURI(EndPointType endPointType, Params params) {
        final String URI = String.format("%s/%s?%s",
                URL_BASE,
                endPointType.getValue(),
                params.convertToUri()
        );
        return UriComponentsBuilder.fromUriString(URI).build().toUri();
    }

    private void checkReponse(HttpStatusCode statusCode) {
        if (!statusCode.is2xxSuccessful()) {
            throw new PokemonTradeCardGameException(statusCode);
        }
    }

    @Override
    public <T> T fetchData(EndPointType endPointType, Params params, Class<T> clazz) {
        try {
            final URI LINK = createURI(endPointType, params);
            ResponseEntity<T> response = restTemplate.getForEntity(LINK, clazz);

            checkReponse(response.getStatusCode());
            return response.getBody();

        } catch (HttpMessageConversionException e) {
            log.error("Erro na conversão da resposta JSON: ", e);
            throw e;
        } catch (RestClientException e) {
            log.error("Erro de comunicação com o serviço externo: ", e);
            throw e;
        } catch (Exception e) {
            log.error("Erro inesperado: ", e);
            throw e;
        }
    }
}
