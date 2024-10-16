package com.kilicdev.personalfinancetracker.mapper;

import com.kilicdev.personalfinancetracker.dto.TransactionHistoryDTO;
import com.kilicdev.personalfinancetracker.model.TransactionHistory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionHistoryMapper {

  TransactionHistoryDTO transactionHistoryToTransactionHistoryDto(
      TransactionHistory transactionHistory);

  TransactionHistory TransactionHistoryDtoToTransactionHistory(
      TransactionHistoryDTO transactionHistoryDTO);
}
