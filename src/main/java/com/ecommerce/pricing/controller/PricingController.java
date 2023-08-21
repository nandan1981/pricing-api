package com.ecommerce.pricing.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest.Headers;

@RestController
@RequestMapping("/pricing")
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

}
