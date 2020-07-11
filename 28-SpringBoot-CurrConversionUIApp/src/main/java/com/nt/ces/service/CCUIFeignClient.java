package com.nt.ces.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.ces.model.CurrencyCostModel;

@FeignClient(name="CURRENCY-CONVERSION-API")
public interface CCUIFeignClient {
	@GetMapping(value="/convertCurrency/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyCostModel getCurrencyCost(@PathVariable("from") String from, @PathVariable("to") String to,@PathVariable("quantity")Double quantity);
}
