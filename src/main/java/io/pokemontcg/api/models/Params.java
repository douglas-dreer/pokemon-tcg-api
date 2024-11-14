package io.pokemontcg.api.models;

import io.pokemontcg.api.enums.PokemonType;
import io.pokemontcg.api.enums.RarityType;
import io.pokemontcg.api.enums.SubType;
import io.pokemontcg.api.enums.SuperType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Params {
    private String set;
    private PokemonType type;
    private SuperType supertype;
    private SubType subtype;
    private RarityType rarity;
    private Integer page;
    private Integer pageSize;

    public String convertToUri() {
        Map<String, String> paramMap = convertToMap();

        return paramMap.entrySet().stream()
                .map(entry -> String.format("%s=%s", entry.getKey(), entry.getValue()))
                .reduce((param1, param2) -> param1 + "&" + param2)
                .orElse("");
    }

    private Map<String, String> convertToMap() {
        Map<String, String> queryParams = new LinkedHashMap<>();

        BiConsumer<String, String> addOrConcat = (key, value) -> {
            queryParams.merge(key, value, (existingValue, newValue) -> String.format("%s %s", existingValue, newValue));
        };

        Optional.ofNullable(set).ifPresent(value       -> addOrConcat.accept("q", "set.id:" + value));
        Optional.ofNullable(type).ifPresent(value      -> addOrConcat.accept("q", "types:" + value));
        Optional.ofNullable(subtype).ifPresent(value   -> addOrConcat.accept("q", "subtypes:" + value));
        Optional.ofNullable(supertype).ifPresent(value -> addOrConcat.accept("q", "supertype:" + value));
        Optional.ofNullable(rarity).ifPresent(value    -> addOrConcat.accept("q", "rarity:" + value));
        Optional.ofNullable(page).ifPresent(value      -> queryParams.put("page", value.toString()));
        Optional.ofNullable(pageSize).ifPresent(value  -> queryParams.put("pageSize", value.toString()));

        return queryParams;
    }
}
