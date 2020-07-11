package com.nt.rto.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.rto.entities.VehicleOwnerDetailsEntity;
import com.nt.rto.pojo.VehicleOwnerDetails;
import com.nt.rto.service.RtoAppService;

@Controller
public class VehicleOwnerDetailsController {

	@Autowired
	RtoAppService service;

	@RequestMapping(value = "/registerVehicle")
	public String loadForm1(Model model) {
		VehicleOwnerDetails vhclDtl = new VehicleOwnerDetails();
		model.addAttribute("vehicleOnrData", vhclDtl);
		return "form1";
	}

	@RequestMapping(value = "/vehicleOwnerDtl", method = RequestMethod.POST)
	public String insertForm1Data(Model model, @ModelAttribute("vehicleOnrData") VehicleOwnerDetails vhclOnrDtl) {
		System.out.println("VehicleOwnerDtls :" + vhclOnrDtl);
		// insert record into db
		int id=service.registerOnrDtls(vhclOnrDtl);
		
		return "redirect:/vehicleDtls?id="+id;
	}
}