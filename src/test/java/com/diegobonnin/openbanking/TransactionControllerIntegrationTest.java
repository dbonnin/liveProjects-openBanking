package com.diegobonnin.openbanking;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.diegobonnin.openbanking.domain.Transaction;
import com.diegobonnin.openbanking.services.TransactionDTO;
import com.diegobonnin.openbanking.services.TransactionService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;


@SpringBootTest
@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
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
    public void testGetTransactions() throws Exception {
    	
    	String accountNumber="123456";

		List<Transaction> transactions = new ArrayList<>();

		transactions.add(Transaction.builder()
		        .type("Credit")
		        .date(LocalDate.now())
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(100.0))
		        .merchantName("Amazon")
		        .merchantLogo("https://amazon.com/logo.png")
		        .build());

		transactions.add(Transaction.builder()
		        .type("Debit")
		        .date(LocalDate.now().minusDays(1))
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(50.0))
		        .merchantName("Google")
		        .merchantLogo("https://google.com/logo.png")
		        .build());

		transactions.add(Transaction.builder()
		        .type("Credit")
		        .date(LocalDate.now().minusDays(2))
		        .accountNumber(accountNumber)
		        .currency("USD")
		        .amount(BigDecimal.valueOf(200.0))
		        .merchantName("Apple")
		        .merchantLogo("https://apple.com/logo.png")
		        .build());
		
		given(transactionService.findAllByAccountNumber(accountNumber))
				.willReturn(transactions);

        // Act
        MvcResult result = mockMvc.perform(get("/transactions/" + accountNumber))
                .andExpect(status().isOk())
                .andReturn();

        // Assert
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        
        List<TransactionDTO> transactionDTOs = objectMapper.readValue(
                result.getResponse().getContentAsString(),
                new TypeReference<List<TransactionDTO>>(){});

        assertThat(transactionDTOs).hasSize(3);
        assertThat(transactionDTOs.get(0).getAmount().equals(transactions.get(0).getAmount()));
        assertThat(transactionDTOs.get(1).getAmount().equals(transactions.get(1).getAmount()));
        assertThat(transactionDTOs.get(2).getAmount().equals(transactions.get(2).getAmount()));
        
    }
}