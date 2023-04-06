package com.diegobonnin.openbanking.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.diegobonnin.openbanking.domain.Transaction;
import com.diegobonnin.openbanking.services.TransactionDTO;
import com.diegobonnin.openbanking.services.TransactionService;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transactions/{accountNumber}")
    public List<TransactionDTO> getTransactions(@PathVariable String accountNumber) {
    	
    	List<TransactionDTO> transactions=new ArrayList<>();
    	
        for(Transaction t: transactionService.findAllByAccountNumber(accountNumber))
        	transactions.add(new TransactionDTO(t.getAccountNumber(), t.getAmount()));
        
        return transactions;
        
    }
    
}