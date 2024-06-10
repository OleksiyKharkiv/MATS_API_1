package com.games.dndBE.service;

import com.games.dndBE.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllGameCharacters();

    User getGameCharacterById(String id);

    User createGameCharacter(User gameCharacter);

    User updateGameCharacter(String id, User gameCharacter);

    void deleteGameCharacter(String id);
}