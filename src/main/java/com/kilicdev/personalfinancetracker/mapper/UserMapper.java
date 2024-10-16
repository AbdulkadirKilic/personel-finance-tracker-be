package com.kilicdev.personalfinancetracker.mapper;

import com.kilicdev.personalfinancetracker.dto.UserDTO;
import com.kilicdev.personalfinancetracker.model.Role;
import com.kilicdev.personalfinancetracker.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
    componentModel = "spring",
    uses = {Role.class})
public interface UserMapper {
  @Mapping(source = "role.id", target = "roleId")
  UserDTO userToUserDto(User user);

  @Mapping(source = "roleId", target = "role.id")
  User userDtoToUser(UserDTO userDTO);
}
