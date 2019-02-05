package beanparam;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/beanparam")
public class BeanParamController {

	@GET
	@Path("/getId/{age}")
	public String getPersonById(@BeanParam Person person) {

		return person.toString();

	}

	@GET
	@Path("/getName/{age}")
	public String getPersonByName(@BeanParam Person person) {

		return person.toString();

	}


}
