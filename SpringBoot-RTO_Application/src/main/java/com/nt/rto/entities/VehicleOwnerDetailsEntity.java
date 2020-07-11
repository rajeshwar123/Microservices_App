package com.nt.rto.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
@Table(name="VEHICLE_OWNER_DTLS")
public class VehicleOwnerDetailsEntity {

	@Id
	@GeneratedValue
	@Column(length=30)
	private Integer vehicleOwnerId;
	@Column(length=20)
	private String firstName;
	@Column(length=20)
	private String lastName;
	@Column(length=10)
	private String gender;
	@Column(length=30)
	private String email;
	@Column(length=30)
	private Date dob;
	@Column(length=30)
	private Long  phoneno;
	@CreationTimestamp
	@Column(length=30)
	private Date createDate;
	@UpdateTimestamp
	@Column(length=30)
	private Date updateDate;
	@Column(length=30)
	private Long   ssn;
}