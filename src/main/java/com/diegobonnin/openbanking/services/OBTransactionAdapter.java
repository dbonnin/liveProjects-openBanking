package com.diegobonnin.openbanking.services;

import com.diegobonnin.openbanking.domain.Transaction;
import com.diegobonnin.openbanking.model.OBTransaction6;

public class OBTransactionAdapter {
	
	public Transaction transform(OBTransaction6 obt) {
		
		Transaction t=Transaction
				.builder().accountNumber(obt.getAccountId())
				.builder().accountNumber(obt.getAccountId())
				
				accountId	accountNumber
				creditDebitIndicator	type
				currencyExchange.unitCurrency	currency
				amount.amount * currencyExchange.exchangeRate	amount
				merchantDetails.merchantName	merchantName
				valueDateTime
		
	}

}
