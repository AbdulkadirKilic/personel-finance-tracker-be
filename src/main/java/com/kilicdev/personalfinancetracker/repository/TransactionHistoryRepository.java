package com.kilicdev.personalfinancetracker.repository;

import com.kilicdev.personalfinancetracker.model.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long> {}
