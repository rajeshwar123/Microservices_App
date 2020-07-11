package com.nt.ces.feignclient;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.ces.model.CurrencyExchangeModel;



@FeignClient(name="CURRENCY-EXCHANGE-API")
//@RibbonClient(name="CURRENCY-EXCHANGE-API")
public interface CCFeignClient {
	
	@GetMapping(value="/getCurrencyCost/from/{from}/to/{to}")
	public CurrencyExchangeModel exchangeCostVal(@PathVariable("from") String from, @PathVariable("to") String to);
}