package subresourcelocator;

import javax.ws.rs.GET;

public class SubController {

	@GET
	public String getSubInfo() {

		System.out.println("getSubInfo is called!");
		return "sub info";
	}

}
