package com.nt.ces.model;

import lombok.Data;

@Data
public class CurrencyCostModel {
	private String currencyFrom;
	private String currencyTo;
	private Double totalCostAmt;
	private Integer port;
}
