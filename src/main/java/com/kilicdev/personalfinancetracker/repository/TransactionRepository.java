package com.kilicdev.personalfinancetracker.repository;

import com.kilicdev.personalfinancetracker.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {}
