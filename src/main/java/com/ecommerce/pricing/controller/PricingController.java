package com.ecommerce.pricing.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pricing")
public class PricingController {

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World".toUpperCase();
	}
	
	@GetMapping("/getQuotation")
	public ResponseEntity<String> getQuotation(){
		HttpHeaders headers = new HttpHeaders();
		return ResponseEntity.ok().headers(headers).body("12.44");
	}
	
	@GetMapping("/echo")
	public String echo(){
		
		return "Hello From Pricing Service!!".toUpperCase();
	}

}
