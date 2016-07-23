package me.sumitkawatra.webservice.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "msg_seq_gen")
	@SequenceGenerator(name = "msg_seq_gen", sequenceName = "msg_seq")
	private long id;
	
	private String message;
	private Date created;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,targetEntity=Comment.class,orphanRemoval=true,mappedBy="message")
	private List<Comment> comments;
	
	@ManyToOne(cascade=CascadeType.ALL)	
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Message() {
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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
