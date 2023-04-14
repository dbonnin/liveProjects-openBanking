package com.diegobonnin.openbanking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diegobonnin.openbanking.domain.Transaction;
import com.diegobonnin.openbanking.repositories.TransactionRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TransactionService {
	
	private final TransactionRepository transactionRepository;

	public List<Transaction> findAllByAccountNumber(String accountNumber) {		
		return transactionRepository.findByAccountNumber(accountNumber);
	}
	
	public Transaction createTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	public void deleteAllTransactions(){
		transactionRepository.deleteAll();
	}

}
