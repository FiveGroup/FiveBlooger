package org.five.fiveblogger.service.po;

import org.five.fiveblogger.orm.AbstractBloggerUser;
import org.five.fiveblogger.orm.modul.BloggerUser;
import org.five.fiveblogger.serviceImpl.BloggerUserServiceImpl;

public class BloggerUserPO extends AbstractBloggerUser {
	
	private final BloggerUserServiceImpl bloggerUserService;
	
	public BloggerUserPO(BloggerUserServiceImpl bloggerUserService) {  
        this.bloggerUserService = bloggerUserService;  
    } 
	
	public BloggerUserPO copyFrom(BloggerUser obj) {  
        this.setUserId(obj.getUserId());  
        this.setUserName(obj.getUserName());  
        this.setPassword(obj.getPassword());  
        this.setEmail(obj.getEmail());
        return this;  
    }  

	@Override
	public String findTypeName() {
		// TODO Auto-generated method stub
		return null;
	}

}
