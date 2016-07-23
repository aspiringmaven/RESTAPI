package me.sumitkawatra.webservice.value;

import java.util.Date;

public class CommentVO {
	
	private long id;
	private String comment;
	private Date created;
	private UserVO user;
	
	public CommentVO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}
	
	
	
	
}
