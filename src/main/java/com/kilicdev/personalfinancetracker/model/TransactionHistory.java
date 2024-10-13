package com.kilicdev.personalfinancetracker.model;

import com.kilicdev.personalfinancetracker.enums.transactionhistory.ActionType;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "transaction_history", schema = "finance")
@Getter
@Setter
public class TransactionHistory {

  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transaction_history")
  @SequenceGenerator(
      name = "seq_transaction_history",
      sequenceName = "finance.seq_transaction_history",
      allocationSize = 1)
  @Id
  private Long id;

  @Column(name = "transaction_id", nullable = false)
  private Long transactionId;

  @Column(name = "version")
  private Long version;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "category")
  private String category;

  @Column(name = "type")
  private String type;

  @Column(name = "amount")
  private Double amount;

  @Column(name = "status")
  private String status;

  @Column(name = "description")
  private String description;

  @Column(name = "created_date")
  private LocalDateTime createdDate;

  @Column(name = "created_by")
  private String createdBy;

  @Column(name = "updated_date")
  private LocalDateTime updatedDate;

  @Column(name = "history_created_date")
  private LocalDateTime historyCreatedDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "action_type")
  private ActionType actionType;
}
