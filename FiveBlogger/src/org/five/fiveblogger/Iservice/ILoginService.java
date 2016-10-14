package org.five.fiveblogger.Iservice;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

@Path("/blogger/loginservice")
public interface ILoginService {
	
	@GET
	@Path("/login/{username}/{password}")
	public Map<String,Object> loggin(@PathParam("username") String username,@PathParam("password") String password,
			@Context HttpServletRequest request);
	
	@GET
	@Path("/logout/{username}")
	public Map<String,Object> logout(@PathParam("username") String username,@Context HttpServletRequest request);
}
