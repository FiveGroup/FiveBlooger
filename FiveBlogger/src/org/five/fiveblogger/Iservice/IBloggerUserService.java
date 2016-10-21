package org.five.fiveblogger.Iservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.five.fiveblogger.orm.AbstractBloggerUser;
import org.five.fiveblogger.orm.modul.BloggerUser;

@Path("/blogger/userservice")
public interface IBloggerUserService {
	
	@GET
	@Path("/getUser/{userId}")
	@Produces("application/json") 
	public BloggerUser getUserById(@PathParam("userId") String userId);
	
	//�����û�Id��ѯ�����û�  
    AbstractBloggerUser getAbstractBloggerUserById(int userId);

}
