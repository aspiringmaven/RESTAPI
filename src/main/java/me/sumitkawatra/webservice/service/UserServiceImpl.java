package me.sumitkawatra.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.webservice.dao.UserDao;
import me.sumitkawatra.webservice.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

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

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
