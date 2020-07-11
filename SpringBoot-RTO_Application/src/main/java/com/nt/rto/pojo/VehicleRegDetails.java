package com.nt.rto.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class VehicleRegDetails {
	private Integer vehicleRegId;
	private String vehicleOwnerId;
	private Date regDate;
	private String regCenter;
	private Date createDate;
	private Date updateDate;
	private String vehicleRegNum;
}
