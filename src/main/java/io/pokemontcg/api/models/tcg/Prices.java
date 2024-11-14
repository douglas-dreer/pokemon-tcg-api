package io.pokemontcg.api.models.tcg;

import lombok.*;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Prices {
    private double averageSellPrice;
    private double lowPrice;
    private double trendPrice;
    private Double germanProLow;
    private Double suggestedPrice;
    private Double reverseHoloSell;
    private Double reverseHoloLow;
    private Double reverseHoloTrend;
    private Double lowPriceExPlus;
    private Double avg1;
    private Double avg7;
    private Double avg30;
    private Double reverseHoloAvg1;
    private Double reverseHoloAvg7;
    private Double reverseHoloAvg30;
}
