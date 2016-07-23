package me.sumitkawatra.webservice.value;

import java.util.List;

public class UserVO {
	
	private long id;
	private String name;
	private String profileName;
	
	
	private List<MessageVO> messages;
	
	public UserVO() {
		super();		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public List<MessageVO> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageVO> messages) {
		this.messages = messages;
	}
	
}
