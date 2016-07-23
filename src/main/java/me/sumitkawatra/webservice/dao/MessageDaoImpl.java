package me.sumitkawatra.webservice.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.webservice.domain.Message;

@Repository
public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao {
	
	
	@Autowired
	public MessageDaoImpl(SessionFactory sessionFactory) {
		super();
		super.setSessionFactory(sessionFactory);
	}

	public List<Message> getAll() {

		return null;
	}

	public Message getById(long id) {

		return null;
	}

	public void save(Message object) {

	}

	public void update(Message object) {

	}

	public void delete(Message object) {

	}

	public void deleteById(long id) {

	}

}
