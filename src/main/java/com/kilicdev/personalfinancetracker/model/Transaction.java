package com.kilicdev.personalfinancetracker.model;

import com.kilicdev.personalfinancetracker.enums.transaction.TransactionStatus;
import com.kilicdev.personalfinancetracker.enums.transaction.TransactionType;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "transaction", schema = "finance")
@Getter
@Setter
public class Transaction {

  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transaction")
  @SequenceGenerator(
      name = "seq_transaction",
      sequenceName = "finance.SEQ_TRANSACTION",
      allocationSize = 1)
  @Column(name = "id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @Column(name = "category")
  private String category;

  @Column(name = "amount")
  private Double amount;

  @Column(name = "description")
  private String description;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private TransactionType type;

  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private TransactionStatus status;

  @Column(name = "create_date", nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createDate;

  @Column(name = "created_by")
  private String createdBy;
}
