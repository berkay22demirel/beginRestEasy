package jsonjackson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jackson")
public class JacksonController {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Person get() {

		Person person = new Person();
		person.setId(1);
		person.setName("Berkay");
		person.setSurname("Demirel");

		Address address = new Address();
		address.setCity("İstanbul");

		person.setAddress(address);

		return person;

	}

}
