package com.games.dndBE.controller;

import com.games.dndBE.model.GameCharacter;
import com.games.dndBE.service.GameCharacterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gamecharacters")
@RequiredArgsConstructor
@Api(value = "Game Character API", tags = "Game Characters")
public class GameCharacterController {

    private final GameCharacterService gameCharacterService;

    @ApiOperation(value = "Get all game characters")
    @GetMapping
    public List<GameCharacter> getAllGameCharacters() {
        return gameCharacterService.getAllGameCharacters();
    }

    @ApiOperation(value = "Get game character by ID")
    @GetMapping("/{id}")
    public GameCharacter getGameCharacterById(@PathVariable String id) {
        return gameCharacterService.getGameCharacterById(id);
    }

    @ApiOperation(value = "Create a new game character")
    @PostMapping
    public GameCharacter createGameCharacter(@RequestBody GameCharacter gameCharacter) {
        return gameCharacterService.createGameCharacter(gameCharacter);
    }

    @ApiOperation(value = "Update an existing game character")
    @PutMapping("/{id}")
    public GameCharacter updateGameCharacter(@PathVariable String id, @RequestBody GameCharacter gameCharacter) {
        return gameCharacterService.updateGameCharacter(id, gameCharacter);
    }

    @ApiOperation(value = "Delete a game character by ID")
    @DeleteMapping("/{id}")
    public void deleteGameCharacter(@PathVariable String id) {
        gameCharacterService.deleteGameCharacter(id);
    }
}