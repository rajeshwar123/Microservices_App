package com.nt.lms.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.lms.entities.MemberEntity;
import com.nt.lms.model.MemberModel;
import com.nt.lms.repository.UserRespository;


@Service
public class UserManagementServiceImpl implements UserManagementService {

	
	
	@Autowired
	UserRespository repo;
	
	@Override
	public MemberEntity addUser(MemberModel memberModel) {
		MemberEntity memberEntity=null;
		BeanUtils.copyProperties(memberModel, memberEntity);
		MemberEntity savedUser=repo.save(memberEntity);
		return savedUser;
	}

}
