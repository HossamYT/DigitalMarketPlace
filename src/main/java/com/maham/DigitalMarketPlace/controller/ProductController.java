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

import com.maham.DigitalMarketPlace.model.Product;
import com.maham.DigitalMarketPlace.util.ProductUtil;

/**
 * @author Hossam Tolba
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	HttpHeaders  headers;
	
	@PostMapping(value="/createProduct",  consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> productCreation(@RequestBody Product newProduct) {
		HttpEntity<Product> requestEntity = new HttpEntity<Product>(newProduct , headers);
		return restTemplate.postForEntity("https://etisalat.adverit.com/etisalat_saas_test/ProductCreation", requestEntity, String.class);
	}

	@PostMapping(value="/suspendProduct" , consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> productSuspension(@RequestBody ProductUtil productUtil) {
		HttpEntity<ProductUtil> requestEntity = new HttpEntity<ProductUtil>(productUtil , headers);
		return restTemplate.postForEntity("https://etisalat.adverit.com/etisalat_saas_test/ProductSuspension", requestEntity, String.class);
	}
	
}
