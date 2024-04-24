package com.games.dndBE.repository;

import com.games.dndBE.model.GameCharacter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameCharacterRepository extends MongoRepository<GameCharacter, String> {
}