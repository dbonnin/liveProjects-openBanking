package com.diegobonnin.openbanking.services;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
	
	public TransactionDTO(String accountNumber, BigDecimal amount) {
		this.accountNumber=accountNumber;
		this.amount=amount;
	}
	
	public String type;
	public LocalDate date;
	public String accountNumber;
	public String currency;
	public BigDecimal amount;
	public String merchantName;
	public String merchantLogo;

}
