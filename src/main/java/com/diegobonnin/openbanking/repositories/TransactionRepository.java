package com.diegobonnin.openbanking.repositories;

import java.util.List;

import com.diegobonnin.openbanking.domain.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository  extends CrudRepository<Transaction, Long> {
	
	List<Transaction> findByAccountNumber(String accountNumber);

}
