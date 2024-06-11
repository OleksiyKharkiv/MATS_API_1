package com.api.matsAPI.service;

import com.api.matsAPI.model.APIUser;

public interface UserService {
    APIUser getUserById(String id);
}