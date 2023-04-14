package com.diegobonnin.openbanking;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.diegobonnin.openbanking.domain.Transaction;
import com.diegobonnin.openbanking.services.TransactionService;


@SpringBootTest
public class TransactionServiceTest {
	
	@Autowired
    private TransactionService transactionService;
	
	@AfterEach
	public void deleteTransactions() {
		transactionService.deleteAllTransactions();
	}
	
	@BeforeEach
	public void createTransactions() {
		
		String accountNumber="123456";
		
		transactionService.createTransaction(Transaction.builder()
		        .type("Credit")
		        .date(LocalDate.now())
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(100.0))
		        .merchantName("Amazon")
		        .merchantLogo("https://amazon.com/logo.png")
		        .build());

		transactionService.createTransaction(Transaction.builder()
		        .type("Debit")
		        .date(LocalDate.now().minusDays(1))
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(50.0))
		        .merchantName("Google")
		        .merchantLogo("https://google.com/logo.png")
		        .build());

		transactionService.createTransaction(Transaction.builder()
		        .type("Credit")
		        .date(LocalDate.now().minusDays(2))
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(200.0))
		        .merchantName("Apple")
		        .merchantLogo("https://apple.com/logo.png")
		        .build());		
		
	}

    @Test
    public void testFindAllByAccountNumber() {
        String accountNumber = "123456";
        List<Transaction> transactions = transactionService.findAllByAccountNumber(accountNumber);
        int expectedMinSize = 3;
        int expectedMaxSize = 5;
        Assertions.assertTrue((transactions.size() >= expectedMinSize && transactions.size() <= expectedMaxSize), 
        		"Expected at between " + expectedMinSize + " and " + expectedMaxSize + " transactions");
    }
}