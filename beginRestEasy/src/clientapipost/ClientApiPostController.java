package clientapipost;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/clientapipost")
public class ClientApiPostController {

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public String add(List<Person> persons) {

		System.out.println(persons);
		return "add succeed";
	}

}
