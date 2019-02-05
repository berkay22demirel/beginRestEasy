package applicationregister;

import headerparam.HeaderParamController;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import path.MessageController;
import pathparam.UserController;
import pathsegmentmatrixparam.CarController;
import queryparam.QueryParamController;
import subresourcelocator.SubController;
import subresourcelocator.SubMessageController;
import beanparam.BeanParamController;
import cookieparam.CookieController;
import defaultvalue.DefaultValueController;
import firstexample.HelloController;
import formformparam.FormController;

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
		singletons.add(new QueryParamController());
		singletons.add(new FormController());
		singletons.add(new HeaderParamController());
		singletons.add(new CookieController());
		singletons.add(new BeanParamController());
		singletons.add(new DefaultValueController());

	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
