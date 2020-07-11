package com.nt.atps.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="USER_SIGN_UP_DTLS")
public class UserRegistrationEntity {
	@Id
	@GeneratedValue
	@Column(length=10)
	private Integer userId;
	@Column(length=20)
	private String firstName;
	@Column(length=20)
	private String lastName;
	@Column(length=30)
	private String email;
	@Column(length=10)
	private Long  phoneno;
	@Column(length=10)
	private Date  dob;
	@Column(length=10)
	private String gender;
	@Column(length=10)
	private String accountStatus;
	@Column(length=20)
	private String role;
	@Column(length=20)
	private String password;
	@Column(length=10)
	private String activeStatus;
	@Column(length=10)
	@CreationTimestamp
	private Date createDate;
	@Column(length=10)
	@UpdateTimestamp
	private Date updateDate;
}