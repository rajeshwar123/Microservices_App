package com.nt.rto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.rto.pojo.VehicleOwnerAddressDetails;
import com.nt.rto.pojo.VehicleRegDetails;

@Controller
public class VehicleRegDetailsController {
	
	@RequestMapping(value="/vhclRegDtls")
	public String loadForm3(Model model) {
		VehicleRegDetails vhclRegDtls=new VehicleRegDetails();
		model.addAttribute("vhclRegDtlsData", vhclRegDtls);
		return "form4";
	}
	/*@RequestMapping
	public String loadAllForm(Model model) {
		return "checkDetails";
	}*/
	
}
