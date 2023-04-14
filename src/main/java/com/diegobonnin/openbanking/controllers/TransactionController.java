package com.diegobonnin.openbanking.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.diegobonnin.openbanking.domain.Transaction;
import com.diegobonnin.openbanking.services.TransactionDTO;
import com.diegobonnin.openbanking.services.TransactionService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TransactionController {

    private final TransactionService transactionService;


    @GetMapping("/transactions/{accountNumber}")
    public List<TransactionDTO> getTransactions(@PathVariable String accountNumber) {
    	
    	List<TransactionDTO> transactions=new ArrayList<>();
    	
        for(Transaction t: transactionService.findAllByAccountNumber(accountNumber))
        	transactions.add(
        	
        			TransactionDTO.builder()
    		        .type(t.getType())
    		        .date(t.getDate())
    		        .accountNumber(t.getAccountNumber())
    		        .currency(t.getCurrency())
    		        .amount(t.getAmount())
    		        .merchantName(t.getMerchantName())
    		        .merchantLogo(t.getMerchantLogo())
    		        .build()
        			
        	);
        
        return transactions;
        
    }
    
}