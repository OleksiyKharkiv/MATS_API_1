package com.games.dndBE.service.impl;

import com.games.dndBE.model.User;
import com.games.dndBE.repository.UserRepository;
import com.games.dndBE.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllGameCharacters() {
        return userRepository.findAll();
    }

    @Override
    public User getGameCharacterById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createGameCharacter(User gameCharacter) {
        return userRepository.save(gameCharacter);
    }

    public User updateGameCharacter(String id, User gameCharacter) {
        // Check if the character with the given ID exists
        if (userRepository.existsById(id)) {
            // Save the updated character to the repository
            return userRepository.save(gameCharacter);
        }
        return null;
    }

    @Override
    public void deleteGameCharacter(String id) {
        userRepository.deleteById(id);
    }
}