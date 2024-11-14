package io.pokemontcg.api.utilitaries;

import io.pokemontcg.api.enums.SuperType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SuperTypeConverter implements Converter<String, SuperType> {
    @Override
    public SuperType convert(String source) {
        try {
            return SuperType.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid SuperType: " + source);
        }
    }
}
