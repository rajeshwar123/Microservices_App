package com.nt.rto.pojo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
public class VehicleOwnerAddressDetails {
	
	private Integer addressId;
	private String vehicleOwnerId;
	private Integer hNo;
	private String  streetName;
	private String  city;
	private Integer zipCode;
	@CreationTimestamp
	private Date createDate;
	@UpdateTimestamp
	private Date updateDate;
}
