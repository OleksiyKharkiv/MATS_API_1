package com.games.dndBE.service.impl;

import com.games.dndBE.model.GameCharacter;
import com.games.dndBE.repository.GameCharacterRepository;
import com.games.dndBE.service.GameCharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameCharacterServiceImpl implements GameCharacterService {

    private final GameCharacterRepository gameCharacterRepository;

    @Override
    public List<GameCharacter> getAllGameCharacters() {
        return gameCharacterRepository.findAll();
    }

    @Override
    public GameCharacter getGameCharacterById(String id) {
        return gameCharacterRepository.findById(id).orElse(null);
    }

    public GameCharacter createGameCharacter(GameCharacter gameCharacter) {
        return gameCharacterRepository.save(gameCharacter);
    }

    public GameCharacter updateGameCharacter(String id, GameCharacter gameCharacter) {
        // Check if the character with the given ID exists
        if (gameCharacterRepository.existsById(id)) {
            // Save the updated character to the repository
            return gameCharacterRepository.save(gameCharacter);
        }
        return null;
    }

    @Override
    public void deleteGameCharacter(String id) {
        gameCharacterRepository.deleteById(id);
    }
}