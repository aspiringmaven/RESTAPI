package me.sumitkawatra.webservice.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.sumitkawatra.webservice.domain.Message;
import me.sumitkawatra.webservice.service.MessageService;

@Component
@Path("/messages")
public class MessageResource {

	@Autowired
	private MessageService messageService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAll();
	}
	
	
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
