package io.pokemontcg.api.models.tcg;

import io.pokemontcg.api.enums.PokemonType;
import io.pokemontcg.api.enums.RarityType;
import io.pokemontcg.api.enums.SubType;
import io.pokemontcg.api.enums.SuperType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Card {
    private String id;
    private String name;
    private SuperType supertype;
    private List<SubType> subtypes;
    private int hp;
    private List<PokemonType> types;
    private String evolvesFrom;
    private List<String> evolvesTo;
    private List<String> rules;
    private List<Ability> abilities;
    private List<Attack> attacks;
    private List<Weakness> weaknesses;
    private List<Resistence> resistence;
    private List<PokemonType> retreatCost;
    private int convertedRetreatCost;
    private Set set;
    private String number;
    private String artist;
    private RarityType rarity;
    private String flavorText;
    private List<Integer> nationalPokedexNumbers;
    private Legality legalities;
    private Image images;
    private TradeCardGamePlayer tcgplayer;
    private CardMarket cardmarket;
}
