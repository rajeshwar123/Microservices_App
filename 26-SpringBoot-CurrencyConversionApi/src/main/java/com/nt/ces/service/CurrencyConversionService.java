package com.nt.ces.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.ces.feignclient.CCFeignClient;

import com.nt.ces.model.CurrencyCostModel;
import com.nt.ces.model.CurrencyExchangeModel;

@Service
public class CurrencyConversionService {
	
	@Autowired
	CCFeignClient ccFeingClient;

	//private static final String CURRENCY_EXCHANGE_URL = "http://desktop-dtidha9:5566/getCurrencyCost/from/{from}/to/{to}";
	public CurrencyConversionService() {
		System.out.println("CurrencyConversionService.CurrencyConversionService()");
	}
	
	public CurrencyCostModel convertCurrency(String from, String to, Double quantity) {
		CurrencyCostModel currencyCostModel = new CurrencyCostModel();
		
/*
		aBuilder builder = WebClient.builder();

		WebClient webClient = builder.build();

		CurrencyExchangeModel currencyExchangeModel = webClient
				.get()
				.uri(CURRENCY_EXCHANGE_URL, from, to)
				.retrieve()
				.bodyToMono(CurrencyExchangeModel.class)
				.block();
*/
		
		//get CurrencyExchangeModel
		CurrencyExchangeModel currencyExchangeModel = ccFeingClient.exchangeCostVal(from, to);
	
		Double currencyCost = currencyExchangeModel.getCurrencyVal();

		Double crrncyCstTtlAmt = currencyCost * quantity;

		// set values to model
		currencyCostModel.setCurrencyFrom(from);
		currencyCostModel.setCurrencyTo(to);
		currencyCostModel.setTotalCostAmt(crrncyCstTtlAmt);
		currencyCostModel.setPort(currencyExchangeModel.getPort());
		return currencyCostModel;
	}
}
