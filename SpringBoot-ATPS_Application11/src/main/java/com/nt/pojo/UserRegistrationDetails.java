package com.nt.pojo;

import java.util.Date;

import lombok.Data;
@Data
public class UserRegistrationDetails {
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private Long  phoneno;
	private Date  dob;
	private String gender;
	private String accountStatus;
	private String role;
	private String password;
	private String activeStatus; 

}
