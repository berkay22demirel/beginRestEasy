package defaultvalue;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("defaultvalue")
public class DefaultValueController {

	@GET
	@Path("/get")
	public String getCarById(@DefaultValue("0") @QueryParam("id") int id) {

		return " Id : " + id;
	}

	// We can use DefaultValue annotation with
	// javax.ws.rs.PathParam
	// javax.ws.rs.QueryParam
	// javax.ws.rs.MatrixParam
	// javax.ws.rs.CookieParam
	// javax.ws.rs.FormParam
	// javax.ws.rs.HeaderParam


}
