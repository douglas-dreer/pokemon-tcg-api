package io.pokemontcg.api.services;

import io.pokemontcg.api.enums.*;
import io.pokemontcg.api.models.tcg.Data;
import io.pokemontcg.api.models.Params;
import org.springframework.stereotype.Service;

@Service
public class PokemonTradeCardGameServiceImpl implements PokemonTradeCardGameService {
    private final RestTemplateServiceImpl service;
    private Params params;

    public PokemonTradeCardGameServiceImpl(RestTemplateServiceImpl service) {
        this.service = service;
    }

    @Override
    public Data findAllCards(int page, int pageSize) {
        params = Params.builder()
                .page(page)
                .pageSize(pageSize)
                .build();
        return service.fetchData(EndPointType.CARDS, params, Data.class);
    }

    @Override
    public Data findAllCardBySet(String set, int page, int pageSize) {
        params = Params.builder()
                .page(page)
                .pageSize(pageSize)
                .set(set)
                .build();
        return this.service.fetchData(EndPointType.CARDS, params, Data.class);

    }

    @Override
    public Data findAllCardBySetAndPokemonType(String setName, PokemonType pokemonType, int page, int pageSize) {
        params = Params.builder()
                .page(page)
                .pageSize(pageSize)
                .set(setName)
                .type(pokemonType)
                .build();
        return this.service.fetchData(EndPointType.CARDS, params, Data.class);
    }

    @Override
    public Data findAllCardBySetAndSuperType(String setName, SuperType supertype, int page, int pageSize) {
        params = Params.builder()
                .page(page)
                .pageSize(pageSize)
                .set(setName)
                .supertype(supertype)
                .build();
        return this.service.fetchData(EndPointType.CARDS, params, Data.class);
    }

    @Override
    public Data     findAllCardBySetAndSubType(String setName, SubType subtype, int page, int pageSize) {
        params = Params.builder()
                .page(page)
                .pageSize(pageSize)
                .set(setName)
                .subtype(subtype)
                .build();
        return this.service.fetchData(EndPointType.CARDS, params, Data.class);
    }

    @Override
    public Data findAllCardBySetAndRarity(String setName, RarityType rarity, int page, int pageSize) {
        params = Params.builder()
                .page(page)
                .pageSize(pageSize)
                .set(setName)
                .rarity(rarity)
                .build();
        return this.service.fetchData(EndPointType.CARDS, params, Data.class);
    }
}
