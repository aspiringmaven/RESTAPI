package me.sumitkawatra.webservice.resource;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.sumitkawatra.webservice.service.MessageService;

@Component
@Path("/messages")
public class MessageResource {

	@Autowired
	private MessageService messageService;
	
	public MessageResource() {
		super();
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
}
