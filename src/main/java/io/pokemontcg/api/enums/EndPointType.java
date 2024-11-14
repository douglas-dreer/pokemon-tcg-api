package io.pokemontcg.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EndPointType {
    CARDS("cards"),
    TYPES("types"),
    SUBTYPES("subtypes"),
    SUPERTYPES("supertypes"),
    SETS("sets"),
    RARITIES("rarities");

    private final String value;
}
