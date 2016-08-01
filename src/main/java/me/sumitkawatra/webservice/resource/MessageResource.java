package me.sumitkawatra.webservice.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathVariable("messageId")int messageId) {
		return messageService.getById(messageId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Message saveMessage(Message message) {
		//TODO
		return message;
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/messageId")
	public Message updateUser(@PathParam("messageId") int messageId, Message message) {
		//TODO
		return message;
	}
	
	@DELETE
	@Path("/{messageId}")
	public Response deleteUser(@PathParam("messageId") int messageId) {
		//TODO
		return Response.status(Status.OK).build();
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
