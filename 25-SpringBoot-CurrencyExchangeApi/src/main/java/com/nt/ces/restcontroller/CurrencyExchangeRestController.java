package com.nt.ces.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.ces.model.CurrencyExchangeModel;
import com.nt.ces.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeRestController {

	public CurrencyExchangeRestController() {
		System.out.println("CurrencyExchangeRestController.CurrencyExchangeRestController()");
	}

	@Autowired
	CurrencyExchangeService service;

	@GetMapping(value = "/getCurrencyCost/from/{from}/to/{to}", produces = "application/json")
	public CurrencyExchangeModel getCurrencyCostDtls(@PathVariable("from") String from, @PathVariable("to") String to) {
		CurrencyExchangeModel pojo = service.findCurrencyValFromAndTo(from, to);
		return pojo;
	}
}