package applicationregister;

import headerparam.HeaderParamController;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import jaxb.JaxbController;
import jsonjackson.JacksonController;
import path.MessageController;
import pathparam.UserController;
import pathsegmentmatrixparam.CarController;
import queryparam.QueryParamController;
import responsecode.ResponseCodeController;
import responsetypes.ResponseTypeController;
import subresourcelocator.SubController;
import subresourcelocator.SubMessageController;
import webapplicationexception.WebApplicationExceptionController;
import beanparam.BeanParamController;
import clientapi.ClientApiController;
import cookieparam.CookieController;
import defaultvalue.DefaultValueController;
import exceptionmapping.ExceptionMappingController;
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
		singletons.add(new ResponseTypeController());
		singletons.add(new JaxbController());
		singletons.add(new JacksonController());
		singletons.add(new ResponseCodeController());
		singletons.add(new WebApplicationExceptionController());
		singletons.add(new ExceptionMappingController());
		singletons.add(new ClientApiController());

	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
