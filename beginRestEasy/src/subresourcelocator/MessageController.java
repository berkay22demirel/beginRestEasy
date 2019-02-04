package subresourcelocator;

import javax.ws.rs.Path;

@Path("/example")
public class MessageController {

	@Path("/sub")
	public SubController getMessage() {

		System.out.println("get message is called!");

		SubController sub = new SubController();

		return sub;
	}

}
