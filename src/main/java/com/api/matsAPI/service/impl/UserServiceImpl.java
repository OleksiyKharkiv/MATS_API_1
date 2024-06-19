package com.api.matsAPI.service.impl;

import com.api.matsAPI.model.APIUser;
import com.api.matsAPI.repository.APIUserRepository;
import com.api.matsAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final APIUserRepository apiUserRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public APIUser getAPIUserById(String id) {
        logger.debug("Searching for user with id: {}", id);
        APIUser user = apiUserRepository.findById(id).orElse(null);
        if (user == null) {
            logger.debug("User not found with id: {}", id);
        } else {
            logger.debug("User found: {}", user);
        }
        return user;
    }

    @Override
    public List<APIUser> getAllAPIUser() {
        return apiUserRepository.findAll();
    }
}