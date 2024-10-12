package com.kilicdev.personalfinancetracker.service;

import com.kilicdev.personalfinancetracker.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements ITransactionService {
	private TransactionRepository transactionRepository;
}
