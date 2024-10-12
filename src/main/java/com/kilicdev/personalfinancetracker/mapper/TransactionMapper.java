package com.kilicdev.personalfinancetracker.mapper;

import com.kilicdev.personalfinancetracker.dto.TransactionDTO;
import com.kilicdev.personalfinancetracker.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
  @Mapping(source = "user.id", target = "userId")
  TransactionDTO toDTO(Transaction transaction);

  @Mapping(source = "userId", target = "user.id")
  Transaction toEntity(TransactionDTO transactionDTO);
}
