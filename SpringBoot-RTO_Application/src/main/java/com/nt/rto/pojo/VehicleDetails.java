package com.nt.rto.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
public class VehicleDetails {
	private Integer vehicleDtlId;
	private Integer vehicleOwnerId;
	private String vehicleType;
	private Integer mfgYear;
	private String vehicleBrand;
	@CreationTimestamp
	private Date createDate;
	@UpdateTimestamp
	private Date updateDate;
}
