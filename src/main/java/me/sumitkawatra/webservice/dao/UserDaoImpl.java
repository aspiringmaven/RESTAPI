package me.sumitkawatra.webservice.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.webservice.domain.User;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		super.setSessionFactory(sessionFactory);
	}

	public List<User> getAll() {

		return null;
	}

	public User getById(long id) {

		return null;
	}

	public void save(User object) {

	}

	public void update(User object) {

	}

	public void delete(User object) {

	}

	public void deleteById(long id) {

	}

}
