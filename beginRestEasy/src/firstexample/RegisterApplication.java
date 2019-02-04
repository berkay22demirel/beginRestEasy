package firstexample;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/homepage")
public class RegisterApplication extends Application {

	private Set<Object> singletons = new HashSet<>();

	public RegisterApplication() {
		singletons.add(new MessageController());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
