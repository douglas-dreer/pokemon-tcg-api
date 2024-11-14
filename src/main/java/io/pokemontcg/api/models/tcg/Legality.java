package io.pokemontcg.api.models.tcg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Legality {
    private String unlimited;
    private String expanded;
}
