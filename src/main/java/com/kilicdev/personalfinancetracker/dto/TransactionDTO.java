package com.kilicdev.personalfinancetracker.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kilicdev.personalfinancetracker.enums.transaction.TransactionStatus;
import com.kilicdev.personalfinancetracker.enums.transaction.TransactionType;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDTO {
  private Long id;
  private Long userId;
  private String category;
  private Double amount;
  private String description;
  private TransactionType type;
  private TransactionStatus status;
  private LocalDateTime createDate;
  private String createdBy;
}
