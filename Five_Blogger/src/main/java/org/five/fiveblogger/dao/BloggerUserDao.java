package org.five.fiveblogger.dao;

import org.five.fiveblogger.model.BloggerUser;

public interface BloggerUserDao {
	void insertBloggerUser(BloggerUser user);  
	  
	BloggerUser getBloggerUserById(int userId);  
  
    void updateBloggerUser(BloggerUser user);  
  
    int deleteBloggerUser(int userId);
}
