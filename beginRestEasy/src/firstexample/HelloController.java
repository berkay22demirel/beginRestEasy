package firstexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloController {

	@GET
	@Path("/sayHello")
	public String sayHello() {

		String message = "Hello! Welcome to www.berkay22demirel.com";
		return message;

	}

}
