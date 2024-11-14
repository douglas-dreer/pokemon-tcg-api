package io.pokemontcg.api.utilitaries;

import io.pokemontcg.api.enums.SubType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SubTypeConverter implements Converter<String, SubType> {
    @Override
    public SubType convert(String source) {
        try {
            return SubType.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid SubType: " + source);
        }
    }
}
