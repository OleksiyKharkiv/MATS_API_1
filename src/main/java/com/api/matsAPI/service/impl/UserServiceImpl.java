package com.api.matsAPI.service.impl;

import com.api.matsAPI.model.APIUser;
import com.api.matsAPI.repository.UserRepository;
import com.api.matsAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public APIUser getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
}