package me.sumitkawatra.webservice.resource;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.sumitkawatra.webservice.domain.User;
import me.sumitkawatra.webservice.service.UserService;

@Component
@Path("/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<User> getUsers(){
		//TODO return Users List
		//TODO Pagination Parameters
		return new ArrayList<User>();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{userId}")
	public User getUser(@PathParam("userId") int userId){
		//TODO Return User based on userId
		return new User();
	}
	

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
