package org.five.fiveblogger.serviceImpl;

import org.five.fiveblogger.Iservice.IBloggerUserService;
import org.five.fiveblogger.orm.AbstractBloggerUser;
import org.five.fiveblogger.orm.mapper.BloggerUserMapper;
import org.five.fiveblogger.orm.modul.BloggerUser;
import org.springframework.beans.factory.annotation.Autowired;

public class BloggerUserServiceImpl implements IBloggerUserService {
	
	@Autowired  
    private BloggerUserMapper userMapper;
	
	@Override
	public BloggerUser getUserById(String userId) {
		return userMapper.get(Integer.valueOf(userId));
	}

	@Override
	public AbstractBloggerUser getAbstractBloggerUserById(int userId) {
		throw new UnsupportedOperationException("Not supported yet.");
	}  

}
