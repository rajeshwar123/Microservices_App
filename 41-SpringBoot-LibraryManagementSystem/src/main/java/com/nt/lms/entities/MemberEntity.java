package com.nt.lms.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class MemberEntity {
	
	@Id
	@GeneratedValue
	@Column(name="mid",length=30)
	private Integer mid;
	
	private String fname;
	
	private String lname;
	
	private String username;
	
	private String password;
	
}