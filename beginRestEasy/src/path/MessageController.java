package path;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/path")
public class MessageController {

	@GET
	public String sayHello() {

		String message = "Hello!";
		return message;

	}

}
