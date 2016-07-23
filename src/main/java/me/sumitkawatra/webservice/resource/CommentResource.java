package me.sumitkawatra.webservice.resource;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.sumitkawatra.webservice.service.CommentService;

@Component
@Path("/comments")
public class CommentResource {

	@Autowired
	private CommentService commentService;

	public CommentResource() {
		super();
	}	

	public CommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}
}