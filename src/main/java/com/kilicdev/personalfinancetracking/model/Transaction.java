package com.kilicdev.personalfinancetracking.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "TRANSACTION")
@Getter
@Setter
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String category;
	private Double amount;
	private LocalDate date;
	@Enumerated(EnumType.STRING)
	private TransactionType type;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public enum TransactionType {
		INCOME, EXPENSE
	}
}
