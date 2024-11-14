package io.pokemontcg.api.models.tcg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Ability {
    private String name;
    private String text;
    private String type;
}
