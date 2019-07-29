/*
 * Copyright(C) 2016 GMO-Z.com RUNSYSTEM JSC. All rights reserved.
 *
 * (1)ã?“ã?®ã‚½ãƒ•ãƒˆã‚¦ã‚§ã‚¢ã?¯ã€?GMOæ ªå¼?ä¼šç¤¾ã?«å¸°å±žã?™ã‚‹æ©Ÿå¯†æƒ…å ± ã?§ã?‚ã‚Šé–‹ç¤ºã‚’å›ºã??ç¦?ã?˜ã?¾ã?™ã€‚
 * (2)ã?“ã?®æƒ…å ±ã‚’ä½¿ç”¨ã?™ã‚‹ã?«ã?¯ã€?GMOæ ªå¼?ä¼šç¤¾ã?¨ã?®ãƒ©ã‚¤ã‚»ãƒ³ã‚¹ å¥‘ç´„ã?Œå¿…è¦?ã?¨ã?ªã‚Šã?¾ã?™ã€‚
 *
 * This software is the confidential and proprietary information of
 * GMO-Z.com RUNSYSTEM. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with GMO-Z.com RUNSYSTEM.
 */
package com.viettel.bankplus.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author : tuyendt
 * @PG_ID : User
 * @createDate : 28.07.2019
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

	/** Init serialVersionUID is 1L **/
	private static final long serialVersionUID = 1L;

	/** Init userId **/
	@Id
	@Column(name = "user_id", length = 10, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	/** Init username **/
	@Column(name = "user_name", length = 255, nullable = false)
	private String username;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
