package com.api.matsAPI.service.impl;

import com.api.matsAPI.model.APIUser;
import com.api.matsAPI.repository.APIUserRepository;
import com.api.matsAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final APIUserRepository APIUserRepository;

    @Override
    public APIUser getUserById(String id) {
        return APIUserRepository.findById(id).orElse(null);
    }
}