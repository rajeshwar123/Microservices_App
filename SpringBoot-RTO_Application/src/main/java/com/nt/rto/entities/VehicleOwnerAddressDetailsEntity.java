package com.nt.rto.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="VEHICLE_OWNER_ADDRS_DTLS")
public class VehicleOwnerAddressDetailsEntity {
	@Id
	@GeneratedValue
	private Integer addressId;
	//private Integer vehicleOwnerId;
	private Integer hNo;
	
	@Column(length=50)
	private String  streetName;
	@Column(length=20)
	private String  city;
	private Integer zipCode;
	@CreationTimestamp
	private Date createDate;
	@UpdateTimestamp
	@Column(length=30)
	private Date updateDate;
	
	@OneToOne
	@JoinColumn(name="VEHICLE_OWNER_ID",nullable=false)
	private VehicleOwnerDetailsEntity vhclOnrDtls;
}