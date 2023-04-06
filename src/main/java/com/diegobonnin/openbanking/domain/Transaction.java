package com.diegobonnin.openbanking.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {
	
	public Transaction(String accountNumber, BigDecimal amount) {
		this.accountNumber=accountNumber;
		this.amount=amount;
	}
	private String type;
	private LocalDate date;
	private String accountNumber;
	private String currency;
	private BigDecimal amount;
	private String merchantName;
	private String merchantLogo;

}
