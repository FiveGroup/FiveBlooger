package org.five.fiveblogger.dao;

import org.five.fiveblogger.model.BloggerUser;

public interface BloggerUserDao {
	int insertBloggerUser(BloggerUser user);  
	  
	BloggerUser getBloggerUserById(int userId);  
  
	BloggerUser getBloggerUserByName(String userName);  
	
    void updateBloggerUser(BloggerUser user);  
  
    int deleteBloggerUser(int userId);
}
