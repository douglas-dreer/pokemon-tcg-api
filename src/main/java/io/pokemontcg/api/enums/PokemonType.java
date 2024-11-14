package io.pokemontcg.api.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PokemonType {
    COLORLESS("Colorless"),
    DARKNESS("Darkness"),
    DRAGON("Dragon"),
    FAIRY("Fairy"),
    FIGHTING("Fighting"),
    FIRE("Fire"),
    GRASS("Grass"),
    LIGHTNING("Lightning"),
    METAL("Metal"),
    PSYCHIC("Psychic"),
    WATER("Water");

    @JsonValue
    private final String value;
}
