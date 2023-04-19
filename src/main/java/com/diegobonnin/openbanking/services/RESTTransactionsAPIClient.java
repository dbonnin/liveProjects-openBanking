package com.diegobonnin.openbanking.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.diegobonnin.openbanking.domain.Transaction;

@Component
public class RESTTransactionsAPIClient implements TransactionApiClient{

	@Override
	public List<Transaction> getTransaccionsByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

