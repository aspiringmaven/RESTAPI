package me.sumitkawatra.webservice.value;

import java.util.Date;
import java.util.List;

public class MessageVO {
	
	private long id;
	private String message;
	private Date created;
	private List<CommentVO> comments;
	private UserVO user;
	
	
	public MessageVO() {
		super();		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public List<CommentVO> getComments() {
		return comments;
	}

	public void setComments(List<CommentVO> comments) {
		this.comments = comments;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}	
}
