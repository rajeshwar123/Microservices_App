package com.nt.ces.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "currency_exchange_dtls")
public class CurrencyExchangeEntity {

	@Id
	@Column(name = "currency_id")
	private Integer currencyId;

	@Column(name = "currency_from")
	private String currencyFrom;

	@Column(name = "currency_to")
	private String currencyTo;

	@Column(name = "currency_val")
	private Double currencyVal;
}
