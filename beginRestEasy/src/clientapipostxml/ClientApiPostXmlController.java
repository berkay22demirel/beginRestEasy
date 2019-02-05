package clientapipostxml;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/clientapipostxml")
public class ClientApiPostXmlController {

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_XML)
	public String add(Person person) {

		System.out.println(person);
		return "add succeed";
	}

}
