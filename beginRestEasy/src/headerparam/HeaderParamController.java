package headerparam;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/headerparam")
public class HeaderParamController {

	@GET
	@Path("/getheaderparam")
	public String get(@HeaderParam("user-agent") String header) {

		return "Result : " + header;

	}

	@GET
	@Path("/gethttpheader")
	public String get(@Context HttpHeaders headers) {

		String message = "Result : ";

		for (String headerName : headers.getRequestHeaders().keySet()) {
			message = message + "<br/>" + headerName + " : "
					+ headers.getRequestHeader(headerName);
		}
		return message;

	}

}
