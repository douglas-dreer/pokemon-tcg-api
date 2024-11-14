package io.pokemontcg.api.models.tcg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Holofoil {
    private BigDecimal low;
    private BigDecimal mid;
    private BigDecimal high;
    private BigDecimal market;
    private BigDecimal directLow;
}
