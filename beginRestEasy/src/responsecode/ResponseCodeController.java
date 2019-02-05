package responsecode;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/responsecode")
public class ResponseCodeController {

	@GET
	@Path("/response200")
	public String response200() {

		return "OK Code";
	}

	@GET
	@Path("/response204")
	public String response204() {

		// return null or void

		return null;
	}

	@POST
	@Path("/response205")
	public String response405() {

		return "Method Not Allowed";
	}

}
