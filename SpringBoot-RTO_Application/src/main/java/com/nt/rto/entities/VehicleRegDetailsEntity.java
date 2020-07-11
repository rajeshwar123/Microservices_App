package com.nt.rto.entities;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name="VEHICLE_REG_DTLS")
public class VehicleRegDetailsEntity {
	
	@Id
	@GeneratedValue
	private Integer vehicleRegId;
	//private String vehicleOwnerId;
	
	@CreationTimestamp
	private Date regDate;
	@Column(length=20)
	private String regCenter;
	@CreationTimestamp
	private Date createDate;
	@UpdateTimestamp
	private Date updateDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="VEHICLE_OWNER_ID",nullable=false)
	private VehicleOwnerDetailsEntity vhclOnrDtls;
}