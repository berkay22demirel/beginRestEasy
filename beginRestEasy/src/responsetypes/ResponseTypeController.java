package responsetypes;

import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/response")
public class ResponseTypeController {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/streamingoutput")
	public StreamingOutput streamingOutput() {

		StreamingOutput sOutput = new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				String message = "streamingOutput";
				os.write(message.getBytes());
			}

		};
		return sOutput;
		
	}

	@GET
	@Path("/string")
	public String stringXMLResponse() {
		return "Berkay Demirel";
	}

	@GET
	@Path("/int")
	public int intResponse() {
		return 100;
	}

	@GET
	@Path("/boolean")
	public boolean booleanResponse() {

		return true;
	}

}
