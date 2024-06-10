package com.games.dndBE.controller;

import com.games.dndBE.model.User;
import com.games.dndBE.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gamecharacters")
@RequiredArgsConstructor
public class APIController {

    private final UserService userService;

    @GetMapping
    public List<User> getAllGameCharacters() {
        return userService.getAllGameCharacters();
    }

    @GetMapping("/{id}")
    public User getGameCharacterById(@PathVariable String id) {
        return userService.getGameCharacterById(id);
    }

    @PostMapping
    public User createGameCharacter(@RequestBody User gameCharacter) {
        return userService.createGameCharacter(gameCharacter);
    }

    @PutMapping("/{id}")
    public User updateGameCharacter(@PathVariable String id, @RequestBody User gameCharacter) {
        return userService.updateGameCharacter(id, gameCharacter);
    }

    @DeleteMapping("/{id}")
    public void deleteGameCharacter(@PathVariable String id) {
        userService.deleteGameCharacter(id);
    }
}