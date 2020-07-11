package com.nt.rto.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.rto.entities.VehicleOwnerAddressDetailsEntity;
import com.nt.rto.pojo.VehicleOwnerAddressDetails;
import com.nt.rto.service.RtoAppService;

@Controller
public class VehicleOwnerAddressDetailsController {
	
	@Autowired
	RtoAppService service;
	
	
	@RequestMapping(value="/vhclOnrAdrsDtls")
	public String loadForm3(Model model) {
		VehicleOwnerAddressDetails vhclOnrAddrsDtls=new VehicleOwnerAddressDetails();
		model.addAttribute("vhclOnrAddrsDtlData", vhclOnrAddrsDtls);
		return "form3";
	}
	
	@RequestMapping(name="vehicleOwnerAddrsDetails")
	public String registerAddrsDtls(Model model, @ModelAttribute("vhclOnrAddrsDtlData") VehicleOwnerAddressDetails vhclOnrAdrsDtls) {
      System.out.println("Addresss :"+vhclOnrAdrsDtls);
		//insert entity into db
		service.registerVehicleOnrAdrsDtls(vhclOnrAdrsDtls);
		return "redirect:/vhclRegDtls";
	}

}
