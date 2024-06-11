package com.api.matsAPI.repository;

import com.api.matsAPI.model.APIUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<APIUser, String> {
}