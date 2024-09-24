package com.kilicdev.personalfinancetracking.repository;

import com.kilicdev.personalfinancetracking.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
