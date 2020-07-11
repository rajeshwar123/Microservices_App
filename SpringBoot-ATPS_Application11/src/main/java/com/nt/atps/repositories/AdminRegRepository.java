package com.nt.atps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.atps.entity.UserRegistrationEntity;

public interface AdminRegRepository extends JpaRepository<UserRegistrationEntity, Integer>{
	@Query(value="select count(1) from UserRegistrationEntity where email=:emailId and password=:pwd")
	public int loginUser(String emailId,String pwd);
}
