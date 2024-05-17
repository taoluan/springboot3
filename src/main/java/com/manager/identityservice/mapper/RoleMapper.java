package com.manager.identityservice.mapper;

import com.manager.identityservice.dto.request.PermissionRequest;
import com.manager.identityservice.dto.request.RoleRequest;
import com.manager.identityservice.dto.response.PermissionResponse;
import com.manager.identityservice.dto.response.RoleResponse;
import com.manager.identityservice.entity.Permission;
import com.manager.identityservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
