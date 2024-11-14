package io.pokemontcg.api.models.tcg;

import io.pokemontcg.api.enums.PokemonType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Resistence {
    private PokemonType type;
    private String value;
}
