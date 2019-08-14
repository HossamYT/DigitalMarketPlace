package com.maham.DigitalMarketPlace;

import java.nio.charset.Charset;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DigitalMarketPlaceApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@SuppressWarnings("serial")
	@Bean
	public HttpHeaders getHttpHeaders() {
		return new HttpHeaders()
		{{
	         String auth = "saas_test" + ":" + "Gh7Kjas.a12w";
	         byte[] encodedAuth = Base64.encodeBase64( 
	            auth.getBytes(Charset.forName("US-ASCII")) );
	         String authHeader = "Basic " + new String( encodedAuth );
	         set( "Authorization", authHeader );
	      }};
				
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DigitalMarketPlaceApplication.class, args);
	}

}
