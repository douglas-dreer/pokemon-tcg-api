package io.pokemontcg.api.utilitaries;

import io.pokemontcg.api.enums.PokemonType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PokemonTypeConverter implements Converter<String, PokemonType> {
    @Override
    public PokemonType convert(String source) {
        try {
            return PokemonType.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid PokemonType: " + source);
        }
    }
}
