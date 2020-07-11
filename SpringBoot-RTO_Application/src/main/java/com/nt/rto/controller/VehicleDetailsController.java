package com.nt.rto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.rto.entities.VehicleDetailsEntity;
import com.nt.rto.entities.VehicleOwnerDetailsEntity;
import com.nt.rto.pojo.VehicleDetails;
import com.nt.rto.service.RtoAppService;

@Controller
public class VehicleDetailsController {
	
	@Autowired
	RtoAppService service;
	
	@Autowired
	VehicleOwnerDetailsEntity ownerEntity;
	
	
	//for launching form
	@RequestMapping(value = "/vehicleDtls")
	public String loadForm2(Model model,@RequestParam("id") Integer id) {
		VehicleDetails vehicleDetails = new VehicleDetails();		
		List<String> vBrandList=new ArrayList();
		List<String> vTypeList=new ArrayList();
		//add vehicles type 
		vTypeList.add("Select Vehicle Type");
		vTypeList.add("2 wheeler");
		vTypeList.add("4 wheeler");
		model.addAttribute("typeList", vTypeList);
		
		//add vehicles brands
		vBrandList.add("Select Vehicle Brand");
		vBrandList.add("BMW");
		vBrandList.add("Maruti");
		vBrandList.add("Audi");
		vBrandList.add("Innovo");
		model.addAttribute("brandList", vBrandList);
		model.addAttribute("ownrId", id);
		//add model attribute
		model.addAttribute("vehicleDtlData", vehicleDetails);
		return "form2";
	}
	
	@RequestMapping(value = "/vehicleDetails")
	public String registerVehicleOwnerD(@ModelAttribute("vehicleDtlData") VehicleDetails vehicleDtls, Model model) {
		System.out.println(vehicleDtls);	
		
		//store vehicle dtls in db
		service.registerVehicleDtls(vehicleDtls);
		
		model.addAttribute("vehicleData", vehicleDtls);
	
		return "redirect:/vhclOnrAdrsDtls";
	}
}