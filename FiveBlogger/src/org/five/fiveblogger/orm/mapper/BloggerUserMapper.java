package org.five.fiveblogger.orm.mapper;

import org.apache.ibatis.annotations.Param;
import org.five.fiveblogger.orm.modul.BloggerUser;

public interface BloggerUserMapper {
	void add(BloggerUser user);  
	  
	BloggerUser get(@Param("userId") int userId);  
  
    void update(BloggerUser user);  
  
    int delete(@Param("userId") int userId);
}
