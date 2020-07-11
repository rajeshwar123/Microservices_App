package com.nt.ces.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.nt.ces.entity.CurrencyExchangeEntity;
import com.nt.ces.model.CurrencyExchangeModel;
import com.nt.ces.repo.CurrencyExchangeRepo;

@Service
public class CurrencyExchangeService {

	@Autowired
	CurrencyExchangeRepo repo;
	
	@Autowired
	Environment env;

	public CurrencyExchangeModel findCurrencyValFromAndTo(String from, String to) {
		CurrencyExchangeModel pojo = new CurrencyExchangeModel();
		CurrencyExchangeEntity entity = repo.findCurrencyValFromAndTo(from, to);
		BeanUtils.copyProperties(entity, pojo);
		pojo.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return pojo;
	}

}
