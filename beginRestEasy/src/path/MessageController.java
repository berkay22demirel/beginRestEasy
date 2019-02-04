package path;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class MessageController {

	@GET
	public String sayHello() {

		String message = "Hello!";
		return message;

	}

}
