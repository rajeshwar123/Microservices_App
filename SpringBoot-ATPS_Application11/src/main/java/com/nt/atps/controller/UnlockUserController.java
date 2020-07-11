package com.nt.atps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.atps.service.UserManagementService;
import com.nt.pojo.UnlockUser;

@Controller
public class UnlockUserController {

	@Autowired
	UserManagementService service;

	@RequestMapping("/unlock")
	public String loadUnlockPage(Model model, @RequestParam("email") String email) {
		UnlockUser unlocUsr = new UnlockUser();
		model.addAttribute("unlockUsrData", unlocUsr);
		model.addAttribute("emailId", email);
		return "unlockAccount";
	}

	@RequestMapping(value = "/unlockUser", method = RequestMethod.POST)
	public String unlockUser(Model model, @ModelAttribute("unlockUsrData") UnlockUser unuser) {
		String tempPwd = unuser.getTempPwd();
		String emailId = unuser.getEmail();
		String newPwd = unuser.getNewPwd();
		//get temp pwd from db
		String dbTmpPwd = service.getPwdByEmail(emailId);

		if (tempPwd.equals(dbTmpPwd)) {
			// call service method to update pwd
			int count = service.updatePwdByEmail(newPwd, emailId,"unlocked");
			if (count !=0) {
				// set sucess msg to welcome page
				model.addAttribute("unlockActiveMsg", "Your Password is updated and <br> Account is Activated");
				
		
			} else {
				model.addAttribute("unlockActiveMsg", "password is not updated");
			}
			return "welcome";
		} else {
			model.addAttribute("unlockErrMsg", "Invalid Temporary password");
		}
		return "unlockAccount";
	}// unlockUsr()
}// class