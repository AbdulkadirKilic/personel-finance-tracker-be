package com.kilicdev.personalfinancetracker.service;

import com.kilicdev.personalfinancetracker.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements ITransactionService {
	private TransactionRepository transactionRepository;
}
