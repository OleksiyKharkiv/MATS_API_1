package com.games.dndBE.service;

import com.games.dndBE.model.GameCharacter;

import java.util.List;

public interface GameCharacterService {
    List<GameCharacter> getAllGameCharacters();

    GameCharacter getGameCharacterById(String id);

    GameCharacter createGameCharacter(GameCharacter gameCharacter);

    GameCharacter updateGameCharacter(String id, GameCharacter gameCharacter);

    void deleteGameCharacter(String id);
}