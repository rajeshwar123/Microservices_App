package com.nt.ces.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.nt.ces.model.CurrencyCostModel;

@Service
public class CurrencyConversionService {

	@Autowired
	CCUIFeignClient ccuiFeignClient;
	//private static final String CURRENCY_EXCHANGE_URL = "http://desktop-dtidha9:9636/convertCurrency/from/{from}/to/{to}/quantity/{quantity}";
	public CurrencyConversionService() {
		System.out.println("CurrencyConversionService.CurrencyConversionService()");
	}

	public CurrencyCostModel convertCurrency(String from, String to, Double quantity) {
		/*Builder builder = WebClient.builder();

		WebClient webClient = builder.build();

		CurrencyCostModel currencyCostModel = webClient
				.get()
				.uri(CURRENCY_EXCHANGE_URL, from, to,quantity)
				.retrieve()
				.bodyToMono(CurrencyCostModel.class)
				.block();
*/		
		CurrencyCostModel currencyCostModel = ccuiFeignClient.getCurrencyCost(from, to, quantity);
		return currencyCostModel;
	}
}
