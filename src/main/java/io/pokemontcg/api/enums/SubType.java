package io.pokemontcg.api.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.NoSuchElementException;

@AllArgsConstructor
@Getter
public enum SubType {
    ACE_SPEC("ACE SPEC"),
    ANCIENT("Ancient"),
    BREAK("BREAK"),
    BABY("Baby"),
    BASIC("Basic"),
    EX("EX"),
    ETERNAMAX("Eternamax"),
    FUSION_STRIKE("Fusion Strike"),
    FUTURE("Future"),
    GX("GX"),
    GOLDENROD_GAME_CORNER("Goldenrod Game Corner"),
    ITEM("Item"),
    LEGEND("LEGEND"),
    LEVEL_UP("Level-Up"),
    MEGA("MEGA"),
    POKEMON_TOOL("Pokémon Tool"),
    POKEMON_TOOL_F("Pokémon Tool F"),
    PRIME("Prime"),
    PRISM_STAR("Prism Star"),
    RADIANT("Radiant"),
    RAPID_STRIKE("Rapid Strike"),
    RESTORED("Restored"),
    ROCKETS_SECRET_MACHINE("Rocket's Secret Machine"),
    SP("SP"),
    SINGLE_STRIKE("Single Strike"),
    SPECIAL("Special"),
    STADIUM("Stadium"),
    STAGE_1("Stage 1"),
    STAGE_2("Stage 2"),
    STAR("Star"),
    SUPPORTER("Supporter"),
    TAG_TEAM("TAG TEAM"),
    TEAM_PLASMA("Team Plasma"),
    TECHNICAL_MACHINE("Technical Machine"),
    TERA("Tera"),
    ULTRA_BEAST("Ultra Beast"),
    V("V"),
    V_UNION("V-UNION"),
    VMAX("VMAX"),
    VSTAR("VSTAR"),
    EX_LOWER("ex");

    @JsonValue
    private final String value;
}
