package com.kilicdev.personalfinancetracking.service;

import com.kilicdev.personalfinancetracking.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements ITransactionService {
	private TransactionRepository transactionRepository;
}
