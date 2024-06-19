package com.api.matsAPI.repository;

import com.api.matsAPI.model.APIUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

//@Repository
public interface APIUserRepository extends MongoRepository<APIUser, String> {
//    @Query("{ '_id': ?0 }")
//    APIUser getAPIUserById(String id);
}