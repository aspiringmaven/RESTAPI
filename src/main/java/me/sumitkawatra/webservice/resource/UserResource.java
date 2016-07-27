package me.sumitkawatra.webservice.resource;


import java.util.ArrayList;
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
	
	
	@DELETE
	@Path("/{userId}")
	public Response deleteUser(@PathParam("userId") int userId) {
		//TODO
		return Response.status(Status.OK).build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/userId")
	public User updateUser(@PathParam("userId") int userId, User user) {
		//TODO
		return user;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public User saveUser(User user) {
		//TODO
		return user;
	}	

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
