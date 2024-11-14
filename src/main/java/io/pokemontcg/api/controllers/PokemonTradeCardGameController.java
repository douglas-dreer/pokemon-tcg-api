package io.pokemontcg.api.controllers;

import io.pokemontcg.api.enums.PokemonType;
import io.pokemontcg.api.enums.RarityType;
import io.pokemontcg.api.enums.SubType;
import io.pokemontcg.api.enums.SuperType;
import io.pokemontcg.api.models.tcg.Data;
import io.pokemontcg.api.services.PokemonTradeCardGameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PokemonTradeCardGameController {
    private final PokemonTradeCardGameService service;

    public PokemonTradeCardGameController(PokemonTradeCardGameService service) {
        this.service = service;
    }

    @GetMapping("/cards")
    public ResponseEntity<Data> findAllCards(
            @RequestParam(name = "page", defaultValue = "1", required = false) int page,
            @RequestParam(name = "pageSize", defaultValue = "50", required = false) int pageSize
    ) {
        return ResponseEntity.ok(service.findAllCards(page, pageSize));
    }

    @GetMapping(value = "/cards", params = "set")
    public ResponseEntity<Data> findAllCardsBySet(
            @RequestParam(name = "page", defaultValue = "1", required = false) int page,
            @RequestParam(name = "pageSize", defaultValue = "50", required = false) int pageSize,
            @RequestParam(name = "set") String setName
    ) {
        return ResponseEntity.ok(service.findAllCardBySet(setName,page, pageSize));
    }

    @GetMapping(value = "/cards", params = {"set", "pokemonType"})
    public ResponseEntity<Data> findAllCardsBySetAndPokemonType(
            @RequestParam(name = "page", defaultValue = "1", required = false) int page,
            @RequestParam(name = "pageSize", defaultValue = "50", required = false) int pageSize,
            @RequestParam(name = "pokemonType") PokemonType pokemonType,
            @RequestParam(name = "set") String setName
            ) {
        return ResponseEntity.ok(service.findAllCardBySetAndPokemonType(setName, pokemonType, page, pageSize));
    }

    @GetMapping(value = "/cards",  params = {"set", "superType"})
    public ResponseEntity<Data> findAllCardsBySetAndSuperType(
            @RequestParam(name = "page", defaultValue = "1", required = false) int page,
            @RequestParam(name = "pageSize", defaultValue = "50", required = false) int pageSize,
            @RequestParam(name = "superType") SuperType supertype,
            @RequestParam(name = "set") String setName
    ) {
        return ResponseEntity.ok(service.findAllCardBySetAndSuperType(setName, supertype, page, pageSize));
    }

    @GetMapping(value = "/cards",  params = {"set", "subType"})
    public ResponseEntity<Data> findAllCardsBySetAndSubType(
            @RequestParam(name = "page", defaultValue = "1", required = false) int page,
            @RequestParam(name = "pageSize", defaultValue = "50", required = false) int pageSize,
            @RequestParam(name = "subType", required = true) SubType subtype,
            @RequestParam(name = "set", required = true) String setName
    ) {
        return ResponseEntity.ok(service.findAllCardBySetAndSubType(setName, subtype, page, pageSize));
    }

    @GetMapping(value = "/cards", params = {"set", "rarity"})
    public ResponseEntity<Data> findAllCardsSetAndByRarity(
            @RequestParam(name = "page", defaultValue = "1", required = false) int page,
            @RequestParam(name = "pageSize", defaultValue = "50", required = false) int pageSize,
            @RequestParam(name = "rarity", required = true) RarityType rarity,
            @RequestParam(name = "set", required = true) String setName
    ) {
        return ResponseEntity.ok(service.findAllCardBySetAndRarity(setName, rarity, page, pageSize));
    }
}
