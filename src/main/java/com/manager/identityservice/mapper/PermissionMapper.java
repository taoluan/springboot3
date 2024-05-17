package com.manager.identityservice.mapper;

import com.manager.identityservice.dto.request.RoleRequest;
import com.manager.identityservice.dto.response.RoleResponse;
import com.manager.identityservice.entity.Role;
import org.mapstruct.Mapper;

import com.manager.identityservice.dto.request.PermissionRequest;
import com.manager.identityservice.dto.response.PermissionResponse;
import com.manager.identityservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);

}
