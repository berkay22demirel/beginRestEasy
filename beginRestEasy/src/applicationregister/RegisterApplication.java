package applicationregister;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import path.MessageController;
import pathparam.UserController;
import pathsegmentmatrixparam.CarController;
import subresourcelocator.SubController;
import subresourcelocator.SubMessageController;
import firstexample.HelloController;

@ApplicationPath("/")
public class RegisterApplication extends Application {

	private Set<Object> singletons = new HashSet<>();

	public RegisterApplication() {
		singletons.add(new HelloController());
		singletons.add(new MessageController());
		singletons.add(new SubMessageController());
		singletons.add(new UserController());
		singletons.add(new SubController());
		singletons.add(new CarController());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
