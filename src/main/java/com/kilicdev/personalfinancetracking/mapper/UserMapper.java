package com.kilicdev.personalfinancetracking.mapper;

import com.kilicdev.personalfinancetracking.dto.UserDTO;
import com.kilicdev.personalfinancetracking.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
	@Mapping(source = "transactions", target = "transactionDTOs")
	UserDTO toDto(User user);

	@Mapping(source = "transactionDTOs", target = "transactions")
	User toEntity(UserDTO userDTO);
}
