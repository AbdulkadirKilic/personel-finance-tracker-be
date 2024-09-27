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
	@Column(name = "id")
	private Long id;
	@Column(name = "category")
	private String category;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "date")
	private LocalDate date;
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private TransactionType type;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public enum TransactionType {
		INCOME, EXPENSE
	}
}
