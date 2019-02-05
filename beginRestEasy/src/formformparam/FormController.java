package formformparam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.Form;

@Path("/form")
public class FormController {
	
	@POST
	@Path("/add")
	public String add(@FormParam("name") String name,
			@FormParam("surname") String surname) {
		
		return "Welcome " + name + " " + surname;
		
	}

	@POST
	@Path("/addPerson")
	public String addPerson(@Form Person person) {

		return "Welcome " + person;

	}

}
