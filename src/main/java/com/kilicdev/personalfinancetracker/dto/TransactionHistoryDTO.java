package com.kilicdev.personalfinancetracker.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kilicdev.personalfinancetracker.enums.transactionhistory.ActionType;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionHistoryDTO {

  private Long id;

  private Long transactionId;

  private Long version;

  private Long userId;

  private String category;

  private String type;

  private Double amount;

  private String status;

  private String description;

  private LocalDateTime createdDate;

  private String createdBy;

  private LocalDateTime updatedDate;

  private LocalDateTime historyCreatedDate;

  private ActionType actionType;
}
