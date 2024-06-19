package com.api.matsAPI.service;

import com.api.matsAPI.model.APIUser;

import java.util.List;

public interface UserService {
    APIUser getAPIUserById(String id);

    List<APIUser> getAllAPIUser();
}