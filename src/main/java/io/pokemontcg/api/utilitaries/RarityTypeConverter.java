package io.pokemontcg.api.utilitaries;

import io.pokemontcg.api.enums.RarityType;
import io.pokemontcg.api.exceptions.PokemonTradeCardGameException;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RarityTypeConverter implements Converter<String, RarityType> {
    @Override
    public RarityType convert(String source) {
        for (RarityType rarityType : RarityType.values()) {
            if (source.equalsIgnoreCase(rarityType.getValue())) {
                return rarityType;
            }
        }
        throw new PokemonTradeCardGameException("Invalid rarity type: " + source);
    }
}
