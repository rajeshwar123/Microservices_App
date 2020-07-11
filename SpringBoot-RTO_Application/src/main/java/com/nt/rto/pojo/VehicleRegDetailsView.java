package com.nt.rto.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleRegDetailsView {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private Date dob;
	private Long  phoneno;
	private Long   ssn;
	
	private String vehicleType;
	private Integer mfgYear;
	private String vehicleBrand;
	
	private Integer hNo;
	private String  streetName;
	private String  city;
	private Integer zipCode;
}
