package io.pokemontcg.api.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SuperType {
    ENERGY("Energy"),
    POKEMON("Pokémon"),
    TRAINER("Trainer");

    @JsonValue
    private final String value;
}
