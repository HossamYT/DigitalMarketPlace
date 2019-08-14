/**
 * 
 */
package com.maham.DigitalMarketPlace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.maham.DigitalMarketPlace.model.Account;


/**
 * @author Hossam Tolba
 *
 * This is used to call etisalat API in order to create an account
 * also suspend an account  
 */
@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private RestTemplate restTemplate;	
	@Autowired
	private HttpHeaders headers;
	
	
	/**
	 * Post request to the account creation API by sending the Account data in the body and credentials in headers
	 * JSON response representing account along with product ID 
	 * @param Account
	 * @return  
	 */ 
	@PostMapping(value = "/createAccount" , consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> createAccount (@RequestBody Account newAccount) {
		HttpEntity<Account> requestEntity = new HttpEntity<Account>(newAccount,headers);
		return restTemplate.postForEntity("https://etisalat.adverit.com/etisalat_saas_test/AccountCreation", requestEntity, String.class);
	}
	
	/**
	 * Post request to the account suspension API by sending the accountNumber in the body and credentials in headers
	 * JSON response representing account along with product ID
	 * @param etisalatAccountNumber
	 * @return
	 */
	@PostMapping(value = "/suspendAccount" , consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> accountSuspension (@RequestBody String etisalatAccountNumber){
		HttpEntity<String> requestEntity = new HttpEntity<String>(etisalatAccountNumber,headers);
		return restTemplate.postForEntity("https://etisalat.adverit.com/etisalat_saas_test/AccountSuspension", requestEntity, String.class);
	}
}
