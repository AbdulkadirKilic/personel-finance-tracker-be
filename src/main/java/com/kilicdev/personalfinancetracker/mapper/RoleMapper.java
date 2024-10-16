package com.kilicdev.personalfinancetracker.mapper;

import com.kilicdev.personalfinancetracker.dto.RoleDTO;
import com.kilicdev.personalfinancetracker.model.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

  RoleDTO roleToRoleDto(Role role);

  Role userDtoToUser(RoleDTO roleDTO);
}
