package cookieparam;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/cookie")
public class CookieController {

	@GET
	@Path("/add")
	public Response add() {

		String result = "add";
		ResponseBuilder builder = Response.ok(result);
		builder.cookie(new NewCookie("cookie", "cookieValue"));

		return builder.build();
	}

	@GET
	@Path("/get")
	public Response get(@CookieParam("cookie") String cookie) {

		String result = "get";
		ResponseBuilder builder = Response.ok(result + " myCookie : " + cookie);
		return builder.build();

	}
	
	@GET
	@Path("/getwithcontext")
	public Response getWithContext(@Context HttpHeaders headers) {

		String result = "getWithContext";

		for (String name : headers.getCookies().keySet()) {

			Cookie cookie = headers.getCookies().get(name);
			result = result + "Cookie: " + name + "=" + cookie.getValue()
					+ "<br/>";
		}

		ResponseBuilder builder = Response.ok(result);
		return builder.build();

	}

}
