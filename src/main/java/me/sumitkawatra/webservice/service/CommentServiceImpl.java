package me.sumitkawatra.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.webservice.dao.CommentDao;
import me.sumitkawatra.webservice.domain.Comment;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentDao commentDao;
	
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

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

}
