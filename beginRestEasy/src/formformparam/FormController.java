package formformparam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/form")
public class FormController {
	
	@POST
	@Path("/add")
	public String add(@FormParam("name") String name,
			@FormParam("surname") String surname) {
		
		return "Welcome " + name + " " + surname;
		
	}

}
