package com.diegobonnin.openbanking.services;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TransactionDTO {
	
	public String type;
	public LocalDate date;
	public String accountNumber;
	public String currency;
	public BigDecimal amount;
	public String merchantName;
	public String merchantLogo;

}
