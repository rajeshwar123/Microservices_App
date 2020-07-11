package com.nt.ces.model;

import lombok.Data;

@Data
public class CurrencyExchangeModel {
	
	private Integer currencyId;

	private String currencyFrom;

	private String currencyTo;

	private Double currencyVal;

}
