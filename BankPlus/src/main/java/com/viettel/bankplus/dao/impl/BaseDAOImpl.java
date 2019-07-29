package com.viettel.bankplus.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import com.viettel.bankplus.dao.BaseDAO;
import com.viettel.bankplus.entity.User;

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
@Repository
public class BaseDAOImpl implements BaseDAO {

	/** Init LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(BaseDAOImpl.class);

	/** Init sessionFactory */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @return the session factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public User getUser(Integer id) {
		try {
			Session session = this.sessionFactory.getCurrentSession();
			Query query = session.getNamedQuery("BaseDao.searchById");
			query.setParameter("userId", id);
			User u = new User();
			u = (User) query.list().get(0);
			return u;
		} catch (Exception ex) {
			LOGGER.error(ex);
		}
		return null;
	}

}
