package me.sumitkawatra.webservice.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;


@Path("/ping")
@Component
public class PingResource {

	private static final String HELLO = "Hello Universe, I am alive :)";

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		System.out.println(PingResource.HELLO);


		return PingResource.HELLO;
	}	
}
