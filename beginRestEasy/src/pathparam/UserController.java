package pathparam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/pathparam")
public class UserController {

	@GET
	@Path("/{firstname}/{lastname}")
	public String getUser(@PathParam("firstname") String firstName,
			@PathParam("lastname") String lastName) {

		return firstName + " " + lastName;
	}

}
