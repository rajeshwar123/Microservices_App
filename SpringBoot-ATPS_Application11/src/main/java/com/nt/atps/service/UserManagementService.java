package com.nt.atps.service;

import com.nt.pojo.UserRegistrationDetails;

public interface UserManagementService {
	void registerUser(UserRegistrationDetails usrRegDtls);

	int loginRegUser(String email, String pwd);

	String getPwdByEmail(String emailId);

	int updatePwdByEmail(String newPwd, String emailId,String acStatus);
	
    void recoverPwdByEmail(String email);
    
    String getRoleByEmail(String email);
    
    
    
}
