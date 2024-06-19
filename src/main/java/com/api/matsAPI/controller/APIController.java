package com.api.matsAPI.controller;

import com.api.matsAPI.model.APIUser;
import com.api.matsAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class APIController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<APIUser> getAPIUserById(@PathVariable String id) {
        APIUser user = userService.getAPIUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<APIUser> getAllAPIUser() {
        return userService.getAllAPIUser();
    }
}