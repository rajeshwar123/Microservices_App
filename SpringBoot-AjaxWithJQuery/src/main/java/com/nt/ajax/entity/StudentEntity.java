package com.nt.ajax.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT2_DTLS")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sNoIdGen")
	@SequenceGenerator(name = "sNoIdGen", initialValue = 1, allocationSize = 1, sequenceName = "sNo_Seq")
	private Integer sNo;
	private String fname;
	private String phoneNo;
	private String email;
}