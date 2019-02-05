package clientapi;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

public class ClientApiTest {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/beginRestEasy/clientapi/get";
		String uriJson = "http://localhost:8080/beginRestEasy/clientapi/getjson";
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target(uri);
		Invocation.Builder builder = target.request();
		String message = builder.get(String.class);
		System.out.println(message);

		WebTarget targetJson = client.target(uriJson);
		Invocation.Builder builderJson = targetJson.request();
		List<String> messages = builderJson.get(new GenericType<List<String>>() {});
		System.out.println(messages);

		client.close();
	}

}
