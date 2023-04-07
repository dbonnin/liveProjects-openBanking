package com.diegobonnin.openbanking;

import static io.restassured.RestAssured.*;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import com.diegobonnin.openbanking.services.TransactionDTO;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TransactionComponentTest {
	
	@LocalServerPort
	private int port;

	@Test
	void testGetTransactions() {
		
		// Set up the base URL for Rest-Assured
		RestAssured.baseURI = "http://localhost:" + port;

		// Make a GET request to /transactions/{accountNumber} with the account number
		// "12345"
		Response response = given().pathParam("accountNumber", "12345").when().get("/transactions/{accountNumber}");
 
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
