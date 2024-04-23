package com.games.dndBE.service.impl;

import com.games.dndBE.repository.CharacterRepository;
import com.games.dndBE.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    @Override
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    @Override
    public Character getCharacterById(String id) {
        return characterRepository.findById(id).orElse(null);
    }

    @Override
    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public Character updateCharacter(String id, Character character) {
        // Check if the character with the given ID exists
        if (characterRepository.existsById(id)) {
            // Save the updated character to the repository
            return characterRepository.save(character);
        }
        return null;
    }

    @Override
    public void deleteCharacter(String id) {
        characterRepository.deleteById(id);
    }
}