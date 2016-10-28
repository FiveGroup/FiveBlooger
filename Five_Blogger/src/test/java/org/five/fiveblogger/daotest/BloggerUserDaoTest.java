package org.five.fiveblogger.daotest;

import org.five.fiveblogger.dao.BloggerUserDao;
import org.five.fiveblogger.model.BloggerUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BloggerUserDaoTest {
	
	@Test
	public void insertBloggerUser(){
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		BloggerUserDao userDao=(BloggerUserDao) ctx.getBean("BloggerUserDao");
		BloggerUser user = new BloggerUser();
		user.setUserId(1);
		user.setUserName("tiger");
		user.setPassword("000000");
		user.setEmail("qwe@163.com");
		try{
			userDao.insertBloggerUser(user);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
