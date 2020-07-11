package com.nt.pojo;

import lombok.Data;

@Data
public class UnlockUser {
	private String email;
	private String tempPwd;
	private String newPwd;
	private String confirmPwd;
}
