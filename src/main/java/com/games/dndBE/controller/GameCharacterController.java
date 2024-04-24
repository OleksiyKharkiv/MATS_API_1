package com.games.dndBE.controller;

import com.games.dndBE.model.GameCharacter;
import com.games.dndBE.service.GameCharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gamecharacters")
@RequiredArgsConstructor
public class GameCharacterController {

    private final GameCharacterService gameCharacterService;

    @GetMapping
    public List<GameCharacter> getAllGameCharacters() {
        return gameCharacterService.getAllGameCharacters();
    }

    @GetMapping("/{id}")
    public GameCharacter getGameCharacterById(@PathVariable String id) {
        return gameCharacterService.getGameCharacterById(id);
    }

    @PostMapping
    public GameCharacter createGameCharacter(@RequestBody GameCharacter gameCharacter) {
        return gameCharacterService.createGameCharacter(gameCharacter);
    }

    @PutMapping("/{id}")
    public GameCharacter updateGameCharacter(@PathVariable String id, @RequestBody GameCharacter gameCharacter) {
        return gameCharacterService.updateGameCharacter(id, gameCharacter);
    }

    @DeleteMapping("/{id}")
    public void deleteGameCharacter(@PathVariable String id) {
        gameCharacterService.deleteGameCharacter(id);
    }
}