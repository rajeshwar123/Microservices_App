package com.nt.atps.service;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.nt.atps.entity.UserRegistrationEntity;
import com.nt.atps.repositories.AdminRegRepository;
import com.nt.pojo.AdminRegistrationDetails;
@Service
public class AdminManagementServiceImpl implements AdminMangementService {

	@Autowired
	AdminRegRepository repo;

	@Autowired
	JavaMailSender sender;

	@Override
	public void registerAdmin(AdminRegistrationDetails adminRegDtls) {
		UserRegistrationEntity entity = new UserRegistrationEntity();
		String s1 = null;
		// generate random password
		String tempPwd = String.valueOf(new Random().nextInt());
		// set temp password
		adminRegDtls.setPassword(tempPwd);
		adminRegDtls.setAccountStatus("locked");
		adminRegDtls.setActiveStatus("Y");
		BeanUtils.copyProperties(adminRegDtls, entity);
		repo.save(entity);

		// to send a mail
		// email sending logic
		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);

			// reading mail content form file
			File file = new File("src/main/resources/email.txt");
			Scanner sc = new Scanner(file);
			System.out.println(sc);
			System.out.println("..............");
			while (sc.hasNextLine()) {
				s1 = sc.nextLine();
				s1 = s1.replace("{FIRSTNAME}", adminRegDtls.getFirstName());
				s1 = s1.replace("{LASTNAME}", adminRegDtls.getLastName());
				s1 = s1.replace("{password}", "" + adminRegDtls.getPassword());
				s1 = s1.replace("{email}", adminRegDtls.getEmail());
				System.out.println(s1);
			}
			// set email to send a mail
			helper.setTo(adminRegDtls.getEmail());
			// set email body message
			helper.setText(s1);
			// set email subject message
			helper.setSubject("ATPS Account Registration");
			sender.send(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//method	
}//class 