package clientapipostxml;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientApiTest {
	
	public static void main(String[] args) {

		String uri = "http://localhost:8080/beginRestEasy/clientapipostxml/add";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Entity<Person> xmlEntity = Entity.xml(new Person(1, "Berkay", "Demirel"));

		Invocation.Builder builder = target.request();
		Response response = builder.post(xmlEntity);

		System.out.println("status : " + response.getStatus());
		System.out.println("readEntity: " + response.readEntity(String.class));

		client.close();
	}

}
