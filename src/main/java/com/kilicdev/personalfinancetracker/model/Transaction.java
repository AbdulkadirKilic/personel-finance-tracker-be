package com.kilicdev.personalfinancetracker.model;

import com.kilicdev.personalfinancetracker.enums.transaction.TransactionStatus;
import com.kilicdev.personalfinancetracker.enums.transaction.TransactionType;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "transaction", schema = "finance")
@Getter
@Setter
public class Transaction {

  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transaction")
  @SequenceGenerator(
      name = "seq_transaction",
      sequenceName = "finance.seq_transaction",
      allocationSize = 1)
  @Id
  @Column(name = "id")
  private Long id;

  @Version
  @Column(name = "version", nullable = false)
  private Long version;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @Column(name = "category")
  private String category;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private TransactionType type;

  @Column(name = "amount")
  private Double amount;

  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private TransactionStatus status;

  @Column(name = "description")
  private String description;

  @Column(name = "created_date", nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createdDate;

  @Column(name = "created_by")
  private String createdBy;

  @Column(name = "updated_date")
  @UpdateTimestamp
  private LocalDateTime updatedDate;

  @Column(name = "updated_by")
  private String updatedBy;
}
