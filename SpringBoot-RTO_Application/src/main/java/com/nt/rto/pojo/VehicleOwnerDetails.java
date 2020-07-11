package com.nt.rto.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class VehicleOwnerDetails {
	private Integer vehicleOwnerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private Date dob;
	private Long  phoneno;
	private Date createDate;
	private Date updateDate;
	private Long   ssn;
}
