package com.games.dndBE.service;

import java.util.List;

public interface CharacterService {
    List<Character> getAllCharacters();

    Character getCharacterById(String id);

    Character createCharacter(Character character);

    Character updateCharacter(String id, Character character);

    void deleteCharacter(String id);
}