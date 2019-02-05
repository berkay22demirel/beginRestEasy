package clientapi;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/clientapi")
public class ClientApiController {

	@GET
	@Path("/get")
	public String getMessage() {
		return "Hello";
	}

	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getMessages() {
		return Arrays.asList("Message-1", "Message-2", "Message-3");
	}

}
