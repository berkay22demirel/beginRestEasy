package webapplicationexception;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@Path("/exception")
public class WebApplicationExceptionController {

	@GET
	@Path("/get")
	public String get() {

		throw new WebApplicationException(Response.Status.NOT_FOUND);

	}

}
