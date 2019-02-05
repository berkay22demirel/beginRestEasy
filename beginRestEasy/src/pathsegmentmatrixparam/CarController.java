package pathsegmentmatrixparam;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.PathSegment;

@Path("/car")
public class CarController {

	@GET
	@Path("/{search : criteria}")
	public String findCar(@PathParam("search") PathSegment pathSegment) {

		String amount = pathSegment.getMatrixParameters().getFirst("amount");
		List<String> colors = pathSegment.getMatrixParameters().get("color");

		return "Car - Amount : " + amount + " - Color : " + colors;
	}
	
	@GET
	@Path("/buy")
	public String buyCar(@MatrixParam("id") List<String> idList,
			@MatrixParam("user") String user) {

		return "Buy Cars " + idList + " - User " + user;

	}

}
