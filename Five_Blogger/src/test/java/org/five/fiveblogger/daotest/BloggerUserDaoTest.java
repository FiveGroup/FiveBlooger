package org.five.fiveblogger.daotest;

import junit.framework.Assert;

import org.five.fiveblogger.dao.BloggerUserDao;
import org.five.fiveblogger.model.BloggerUser;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BloggerUserDaoTest {
	
	static BloggerUserDao userDao;
	
	@BeforeClass
	public static void TestInit() throws Exception{
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		userDao=(BloggerUserDao) ctx.getBean("BloggerUserDao");
	}
	
	@Test
	public void BloggerUserDao() throws Exception{
		BloggerUser user = new BloggerUser();
		user.setUserName("tiger");
		user.setPassword("000000");
		user.setEmail("qwe@163.com");
		userDao.insertBloggerUser(user);
		int userId = user.getUserId();
		
		BloggerUser targetUser = userDao.getBloggerUserById(userId);
		Assert.assertEquals(user.getUserName(), targetUser.getUserName());
		
		BloggerUser targetUser1 = userDao.getBloggerUserByName(user.getUserName());
		Assert.assertEquals(userId, targetUser1.getUserId());
		
		userDao.deleteBloggerUser(userId);
		Assert.assertEquals(null, userDao.getBloggerUserById(userId));
	}

}
