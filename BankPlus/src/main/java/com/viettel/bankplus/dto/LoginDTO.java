package com.viettel.bankplus.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginDTO {

	@NotEmpty(message = "NotEmpty")
	private String userName;
	@NotEmpty(message = "NotEmpty")
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
