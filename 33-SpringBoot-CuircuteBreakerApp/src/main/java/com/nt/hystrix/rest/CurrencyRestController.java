package com.nt.hystrix.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class CurrencyRestController {
	private static final String REST_URL = "https://godwe1.cfapps.io/getCurrencyCost/from/USD/to/INR";

	
	@HystrixCommand(fallbackMethod="getCurrencyCostFallback")
	@GetMapping(value = "/getCurrencyCost")
	public String getCurrencyCost() {
		// rest call
		WebClient webClient = WebClient.builder().build();
		String responseVal = webClient.get().uri(REST_URL).retrieve().bodyToMono(String.class).block();
		return responseVal;
	}
	
	//fallback method
	public String getCurrencyCostFallback() {
		return "FallBack Logic";
	}
}