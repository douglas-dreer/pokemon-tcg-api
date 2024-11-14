package io.pokemontcg.api.exceptions;

import org.springframework.http.HttpStatusCode;

public class PokemonTradeCardGameException extends RuntimeException {
  public PokemonTradeCardGameException(String message) {
    super(message);
  }

  public PokemonTradeCardGameException(HttpStatusCode statusCode) {
    super(generateMessage(statusCode));
  }

  public PokemonTradeCardGameException(String message, boolean isNotFoundResult) {
    super(isNotFoundResult ? "NotFoundResult: " + message : message);
  }

  private static String generateMessage(HttpStatusCode statusCode) {
    if (statusCode.value() == 404) {
      return "Erro de cliente (404): Site ou endereço não encontrado";
    } else if (statusCode.value() == 500) {
      return "Erro de servidor (500): Erro interno do servidor.";
    }
    return "Erro inesperado: Código de status " + statusCode;
  }




}
