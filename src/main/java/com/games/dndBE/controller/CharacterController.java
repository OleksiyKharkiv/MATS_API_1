package com.games.dndBE.controller;

import com.games.dndBE.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable String id) {
        return characterService.getCharacterById(id);
    }

    @PostMapping
    public Character createCharacter(@RequestBody Character character) {
        return characterService.createCharacter(character);
    }

    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable String id, @RequestBody Character character) {
        return characterService.updateCharacter(id, character);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable String id) {
        characterService.deleteCharacter(id);
    }
}