package com.manager.identityservice.controller;

import com.manager.identityservice.dto.request.ApiResponse;
import com.manager.identityservice.dto.request.UserCreationRequest;
import com.manager.identityservice.dto.request.UserUpdateRequest;
import com.manager.identityservice.entity.User;
import com.manager.identityservice.exception.SuccessCode;
import com.manager.identityservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createUser(request));
        return apiResponse;
    }

    @GetMapping()
    ApiResponse<List<User>> getUser() {
        ApiResponse<List<User>> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.getUsers());
        return apiResponse;
    }

    @GetMapping("/{userId}")
    ApiResponse<User> getUser(@PathVariable("userId") String userId) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.getUser(userId));
        return apiResponse;
    }

    @PutMapping("/{userId}")
    ApiResponse<User> updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.updateUser(userId, request));
        return apiResponse;
    }

    @DeleteMapping("/{userId}")
    ApiResponse<String> deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);

        ApiResponse<String> apiResponse = new ApiResponse<>();
        SuccessCode successCode = SuccessCode.DELETED_SUCCESS;
        apiResponse.setMessage(successCode.getMessage());
        return apiResponse;
    }
}