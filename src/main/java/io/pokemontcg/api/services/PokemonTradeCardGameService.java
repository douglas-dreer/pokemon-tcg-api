package io.pokemontcg.api.services;

import io.pokemontcg.api.enums.PokemonType;
import io.pokemontcg.api.enums.RarityType;
import io.pokemontcg.api.enums.SubType;
import io.pokemontcg.api.enums.SuperType;
import io.pokemontcg.api.models.tcg.Data;

public interface PokemonTradeCardGameService {
    Data findAllCards(int page, int pageSize);

    Data findAllCardBySet(String setName, int page, int pageSize);
    Data findAllCardBySetAndPokemonType(String setName, PokemonType pokemonType, int page, int pageSize);
    Data findAllCardBySetAndSuperType(String setName, SuperType supertype, int page, int pageSize);
    Data findAllCardBySetAndSubType(String setName, SubType subtype, int page, int pageSize);
    Data findAllCardBySetAndRarity(String setName, RarityType rarity, int page, int pageSize);
}
