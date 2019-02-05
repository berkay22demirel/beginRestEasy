package queryparam;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Path("QueryParam")
public class QueryParamController {
	
	@GET
	@Path("/get")
	public String get(@QueryParam("param1") String param1,
			@QueryParam("param2") int param2,
			@QueryParam("param3") List<String> param3) {

		return "Result = " + param1 + " - " + param2 + " - " + param3;

	}

}
