package org.five.fiveblogger.serviceImpl;

import org.five.fiveblogger.Iservice.IBloggerUserService;
import org.five.fiveblogger.modul.BloggerUser;

public class BloggerUserServiceImpl implements IBloggerUserService {

	@Override
	public BloggerUser getUserById(String userId) {
		BloggerUser user = new BloggerUser();
		user.setUserName("root");
		user.setPassword("000000");
		user.setUserId(1);
		user.setEmail("root@163.com");
		return user;
	}

}
