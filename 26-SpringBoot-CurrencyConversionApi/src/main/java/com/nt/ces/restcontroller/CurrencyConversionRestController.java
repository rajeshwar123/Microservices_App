package com.nt.ces.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.ces.model.CurrencyCostModel;
import com.nt.ces.service.CurrencyConversionService;

@RestController
public class CurrencyConversionRestController {
	@Autowired
	CurrencyConversionService service;

	public CurrencyConversionRestController() {
		System.out.println("CurrencyConversionRestController.CurrencyConversionRestController()");
	}

	/// convertCurrency/from/{from}/to/{to}/quantity/{quantity}
	
	@GetMapping(value = "/convertCurrency/from/{from}/to/{to}/quantity/{quantity}", produces = "application/json")
	public CurrencyCostModel convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable("quantity") Double quantity) {
		CurrencyCostModel currencyCostModel = service.convertCurrency(from, to, quantity);
		return currencyCostModel;
	}
}