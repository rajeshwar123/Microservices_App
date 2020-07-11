package com.nt.ces.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.ces.model.CurrencyCostModel;
import com.nt.ces.model.CurrencyExchangeModel;
import com.nt.ces.service.CurrencyConversionService;

@Controller
public class CurrrencyConversionController {
	
	@Autowired
	CurrencyConversionService service;
	
	public CurrrencyConversionController() {
		System.out.println("CurrrencyConversionController.CurrrencyConversionController()");
	}
	
	@RequestMapping(value="/")
	public String loadForm(Model model) {
		CurrencyExchangeModel pojo=new CurrencyExchangeModel();
		List<String> cList=new ArrayList<String>();
		cList.add("USD");
		cList.add("EUR");
		cList.add("AUD");
		List<String> cList2=new ArrayList<String>();
		cList2.add("INR");
		model.addAttribute("cList", cList);
		model.addAttribute("cList2", cList2);
		model.addAttribute("cConvertData", pojo);
		return "CurrencyConversionPage";		
	}
	
	@RequestMapping(value="/convertCurrency",method=RequestMethod.POST)
	public String convertCurrency(@ModelAttribute("cConvertData") CurrencyExchangeModel pojo,Model model) {
		CurrencyCostModel currencyCostModel = service.convertCurrency(pojo.getCurrencyFrom(), pojo.getCurrencyTo(), pojo.getCurrencyVal());
		model.addAttribute("res", currencyCostModel);
		loadForm(model);
		return "ResultPage";
	}
}