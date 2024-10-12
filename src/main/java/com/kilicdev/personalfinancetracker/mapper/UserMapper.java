package com.kilicdev.personalfinancetracker.mapper;

import com.kilicdev.personalfinancetracker.dto.UserDTO;
import com.kilicdev.personalfinancetracker.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
    componentModel = "spring",
    uses = {TransactionMapper.class})
public interface UserMapper {
  @Mapping(source = "transactions", target = "transactionDTOs")
  @Mapping(target = "password", ignore = true)
  UserDTO UserToUserDto(User user);

  @Mapping(source = "transactionDTOs", target = "transactions")
  @Mapping(target = "password", ignore = true)
  User UserDtoToUser(UserDTO userDTO);
}
