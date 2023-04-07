package com.diegobonnin.openbanking.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Transaction {
	
	private String type;
	private LocalDate date;
	private String accountNumber;
	private String currency;
	private BigDecimal amount;
	private String merchantName;
	private String merchantLogo;

}
