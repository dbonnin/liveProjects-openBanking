package com.diegobonnin.openbanking.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.diegobonnin.openbanking.domain.Transaction;

@Service
public class TransactionService {

	public List<Transaction> findAllByAccountNumber(String accountNumber) {

		List<Transaction> transactions = new ArrayList<>();

		transactions.add(Transaction.builder()
		        .type("Credit")
		        .date(LocalDate.now())
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(100.0))
		        .merchantName("Amazon")
		        .merchantLogo("https://amazon.com/logo.png")
		        .build());

		transactions.add(Transaction.builder()
		        .type("Debit")
		        .date(LocalDate.now().minusDays(1))
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(50.0))
		        .merchantName("Google")
		        .merchantLogo("https://google.com/logo.png")
		        .build());

		transactions.add(Transaction.builder()
		        .type("Credit")
		        .date(LocalDate.now().minusDays(2))
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(200.0))
		        .merchantName("Apple")
		        .merchantLogo("https://apple.com/logo.png")
		        .build());

		return transactions;

	}

}
