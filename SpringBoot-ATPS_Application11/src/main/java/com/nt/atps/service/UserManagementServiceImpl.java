package com.nt.atps.service;


import java.io.File;
import java.util.Random;
import java.util.Scanner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.nt.atps.entity.UserRegistrationEntity;
import com.nt.atps.repositories.UserRegRepository;
import com.nt.pojo.UserRegistrationDetails;

import lombok.experimental.Helper;

@Service
public class UserManagementServiceImpl implements UserManagementService {
	@Autowired
	private UserRegRepository repo;

	@Autowired
	private JavaMailSender sender;
	
	
	/**
	 * to register user
	 */
	@Override
	public void registerUser(UserRegistrationDetails usrRegDtls) {

		UserRegistrationEntity entity = new UserRegistrationEntity();
		String s1 =null;
		// set user role
		usrRegDtls.setRole("user");
		// set a/c status
		usrRegDtls.setAccountStatus("locked");
		//set active status
		usrRegDtls.setActiveStatus("Y");
		
		// generate temporary password
		//convert int to string
		String tmpPwd=String.valueOf(new Random().nextInt(20000));
		usrRegDtls.setPassword(tmpPwd);
		
		// convert usrRegDtls to entity
		System.out.println("pojo= " + usrRegDtls);
		BeanUtils.copyProperties(usrRegDtls, entity);
		// save user dtls in db
		UserRegistrationEntity en = repo.save(entity);
		System.out.println("entity= " + en);
		/////////////////////////////////////////////

		// email sending logic
		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);
			
			//reading mail content form file
			File file = new File("src/main/resources/email.txt");
		    Scanner sc = new Scanner(file); 
			System.out.println(sc);
			System.out.println("..............");
			while (sc.hasNextLine()) {
				s1=sc.nextLine();
				s1=s1.replace("{FIRSTNAME}", usrRegDtls.getFirstName());
				s1=s1.replace("{LASTNAME}", usrRegDtls.getLastName());
				s1=s1.replace("{password}", ""+usrRegDtls.getPassword());
				s1=s1.replace("{email}", usrRegDtls.getEmail());
				System.out.println(s1);
			}
			//set email to send a mail
			helper.setTo(usrRegDtls.getEmail());
			//set email body message
			helper.setText(s1);
			//set email subject message
			helper.setSubject("ATPS Account Registration");
			sender.send(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// method
	/**
	 * login user credentials
	 * 
	 * @param emailId
	 * @param pwd
	 * @return Integer
	 */
	public int loginRegUser(String emailId, String pwd) {
		return repo.loginUser(emailId, pwd);
	}
	
	/**
	 * get password by email
	 */
	@Override
	public String getPwdByEmail(String emailId) {
		String email=repo.getPwdByEmail(emailId);
		return email;
	}
	@Override
	public int updatePwdByEmail(String newPwd, String emailId,String acStatus) {
		
		return repo.updatePwdByEmail(newPwd, emailId,acStatus);
	}
	
	public void recoverPwdByEmail(String email){
	    MimeMessage message=sender.createMimeMessage();
	    MimeMessageHelper helper=new MimeMessageHelper(message);
	    String pwd=repo.getPwdByEmail(email);
	    //to send mail
	    try {
			helper.setTo(email);
			helper.setText("This is your Password ::"+pwd);
			helper.setSubject("ATPS");
			sender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	    
	}
	@Override
	public String getRoleByEmail(String email) {
		return repo.getRoleByEmail(email);
	}
}// class