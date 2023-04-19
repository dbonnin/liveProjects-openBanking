package com.diegobonnin.openbanking.services;

import java.util.List;

import com.diegobonnin.openbanking.domain.Transaction;

public interface TransactionApiClient {
	
	List<Transaction> getTransaccionsByAccountNumber(String accountNumber);

}
