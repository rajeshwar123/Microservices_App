package com.nt.rto.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="VEHICLE_REG_VIEW_DTLS")
public class VehicleRegViewDetailsEntity {
	@Id
	@GeneratedValue
	private Integer regNum;
	@Column(length=20)
	private String firstName;
	@Column(length=20)
	private String lastName;
	@Column(length=10)
	private String gender;
	@Column(length=30)
	private String email;
	private Date dob;
	private Long  phoneno;
	private Long   ssn;
	@Column(length=20)
	private String vehicleType;
	private Integer mfgYear;
	@Column(length=20)
	private String vehicleBrand;
	
	private Integer hNo;
	@Column(length=50)
	private String  streetName;
	@Column(length=20)
	private String  city;
	private Integer zipCode;
}
