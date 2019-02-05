package clientapipost;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientApiTest {
	
	public static void main(String[] args) {

		String uri = "http://localhost:8080/beginRestEasy/clientapipost/add";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		List<Person> persons = Arrays.asList(
				new Person(1, "Berkay", "Demirel"), new Person(2, "James",
						"Gosling"));
		Entity<List<Person>> jsonEntity = Entity.json(persons);

		Invocation.Builder builder = target.request();
		Response response = builder.post(jsonEntity);

		System.out.println("status : " + response.getStatus());
		System.out.println("readEntity: " + response.readEntity(String.class));

		client.close();
	}

}
