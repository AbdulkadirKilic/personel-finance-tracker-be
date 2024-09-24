package com.kilicdev.personalfinancetracking.mapper;

import com.kilicdev.personalfinancetracking.dto.TransactionDTO;
import com.kilicdev.personalfinancetracking.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
	@Mapping(source = "user.id", target = "userId")
	TransactionDTO toDTO(Transaction transaction);

	@Mapping(source = "userId", target = "user.id")
	Transaction toEntity(TransactionDTO transactionDTO);
}
