package com.viettel.bankplus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viettel.bankplus.dao.BaseDAO;
import com.viettel.bankplus.entity.User;
import com.viettel.bankplus.service.BaseService;

/**
 * @author : Tuyendt
 * @PG_ID : BaseServiceImpl
 * @createDate : 06.09.2016
 */
@Service
public class BaseServiceImpl implements BaseService {

	@Autowired
	private BaseDAO baseDAO;
	
	public User getUser(Integer id) {
		return baseDAO.getUser(id);
	}

}
