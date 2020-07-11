package com.nt.ces.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.ces.entity.CurrencyExchangeEntity;

public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchangeEntity, Integer> {

	@Query(value="from CurrencyExchangeEntity where currencyFrom=:from and currencyTo=:to")
	public CurrencyExchangeEntity findCurrencyValFromAndTo(String from,String to);	
}
