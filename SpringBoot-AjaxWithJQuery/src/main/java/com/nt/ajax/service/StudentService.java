package com.nt.ajax.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.ajax.entity.StudentEntity;
import com.nt.ajax.pojo.StudentModel;
import com.nt.ajax.repo.StudentRepo;


@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	
	public int RegisterStudent(StudentModel model) {
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(model, entity);
		StudentEntity savedEntity=repo.save(entity);	
		return savedEntity.getSNo();
	}
}
