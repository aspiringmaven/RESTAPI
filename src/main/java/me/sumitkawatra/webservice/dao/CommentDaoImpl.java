package me.sumitkawatra.webservice.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.webservice.domain.Comment;

@Repository
public class CommentDaoImpl extends HibernateDaoSupport implements CommentDao {

	
	@Autowired
	public CommentDaoImpl(SessionFactory sessionFactory) {	
		super();
		super.setSessionFactory(sessionFactory);
	}

	public List<Comment> getAll() {

		return null;
	}

	public Comment getById(long id) {

		return null;
	}

	public void save(Comment object) {

	}

	public void update(Comment object) {

	}

	public void delete(Comment object) {

	}

	public void deleteById(long id) {

	}

}
