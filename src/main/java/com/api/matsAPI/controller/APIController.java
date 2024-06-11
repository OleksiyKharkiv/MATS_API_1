package com.api.matsAPI.controller;

import com.api.matsAPI.model.APIUser;
import com.api.matsAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class APIController {

    private final UserService userService;

    @GetMapping("/{id}")
    public APIUser getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }
}