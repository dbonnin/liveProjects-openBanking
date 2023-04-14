package com.diegobonnin.openbanking;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import com.diegobonnin.openbanking.domain.Transaction;
import com.diegobonnin.openbanking.services.TransactionDTO;
import com.diegobonnin.openbanking.services.TransactionService;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TransactionComponentTest {
	
	@LocalServerPort
	private int port;
	
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
	void testGetTransactions() {
		
		// Set up the base URL for Rest-Assured
		RestAssured.baseURI = "http://localhost:" + port;

		// Make a GET request to /transactions/{accountNumber} with the account number
		// "12345"
		Response response = given().pathParam("accountNumber", "123456").when().get("/transactions/{accountNumber}");
 
		// Assert that the response has a 200 OK status code
		assertThat(response.statusCode(), is(HttpStatus.OK.value()));
		
        // Deserialize the response body into a list of TransactionDTO objects
        List<TransactionDTO> transactions = response.jsonPath().getList(".", TransactionDTO.class);

        // Assert that the list is not empty
        assertThat(transactions, is(not(empty())));		
        
        for (TransactionDTO transaction : transactions) {
            assertThat(transaction.getType(), is(notNullValue()));
            assertThat(transaction.getDate(), is(notNullValue()));
            assertThat(transaction.getAccountNumber(), is(notNullValue()));
            assertThat(transaction.getCurrency(), is(notNullValue()));
            assertThat(transaction.getAmount(), is(notNullValue()));
            assertThat(transaction.getMerchantName(), is(notNullValue()));
            assertThat(transaction.getMerchantLogo(), is(notNullValue()));
        }


	}
}
