package com.viettel.bankplus.dto;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginDTO {

	@NotEmpty(message = "NotEmpty")
	@Max(value = 12, message = "toi da 12 ky tu")
	private String userName;
	@NotEmpty(message = "NotEmpty")
	@Max(value = 6, message = "toi da 6 ky tu")
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
