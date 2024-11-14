package io.pokemontcg.api.models.tcg;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Data {
    @JsonProperty("data")
    private List<Card> cards;
    private int page;
    private int pageSize;
    private int count;
    private int totalCount;
}
