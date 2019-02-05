package exceptionmapping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/exceptionmapping")
public class ExceptionMappingController {

	@GET
	@Path("/get/{id}")
	public Person getPerson(@PathParam("id") int id) {

		throw new PersonNotFoundException("Person Not Found -  id : " + id);

	}

}
