package com.diegobonnin.openbanking.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.diegobonnin.openbanking.domain.Transaction;

@Service
public class TransactionService {

	public List<Transaction> findAllByAccountNumber(String accountNumber) {

		List<Transaction> transactions = new ArrayList<>();
		transactions.add(new Transaction(accountNumber, new BigDecimal("100.0")));
		transactions.add(new Transaction(accountNumber, new BigDecimal("200.0")));
		transactions.add(new Transaction(accountNumber, new BigDecimal("300.0")));

		return transactions;

	}

}
