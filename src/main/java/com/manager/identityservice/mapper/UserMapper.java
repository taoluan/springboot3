package com.manager.identityservice.mapper;

import com.manager.identityservice.dto.request.UserCreationRequest;
import com.manager.identityservice.dto.request.UserUpdateRequest;
import com.manager.identityservice.dto.response.UserResponse;
import com.manager.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
