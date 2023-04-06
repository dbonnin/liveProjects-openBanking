package com.diegobonnin.openbanking;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.diegobonnin.openbanking.domain.Transaction;
import com.diegobonnin.openbanking.services.TransactionService;

public class TransactionServiceTest {

    private final TransactionService transactionService = new TransactionService();

    @Test
    public void testFindAllByAccountNumber() {
        String accountNumber = "1234567890";
        List<Transaction> transactions = transactionService.findAllByAccountNumber(accountNumber);
        int expectedMinSize = 3;
        int expectedMaxSize = 5;
        Assertions.assertTrue((transactions.size() >= expectedMinSize && transactions.size() <= expectedMaxSize), 
        		"Expected at between " + expectedMinSize + " and " + expectedMaxSize + " transactions");
    }
}