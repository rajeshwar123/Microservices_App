package com.nt.atps.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.nt.atps.entity.UserRegistrationEntity;

public interface UserRegRepository extends CrudRepository<UserRegistrationEntity, Integer> {

	@Query(value="select count(1) from UserRegistrationEntity where email=:emailId and password=:pwd")
	public int loginUser(String emailId,String pwd);
	
	
	@Query(value="select password from UserRegistrationEntity where  email=:emailId")
	public String getPwdByEmail(String emailId);
	
	
	@Modifying(clearAutomatically=true)
	@Transactional
	@Query(value="UPDATE UserRegistrationEntity e SET e.password=:newPwd,e.accountStatus=:acStatus WHERE email=:emailId")
	public int updatePwdByEmail(String newPwd,String emailId,String acStatus);
	
	
	@Query(value="select role from UserRegistrationEntity where email=:emailId")
	public String getRoleByEmail(String emailId);
	
	
}