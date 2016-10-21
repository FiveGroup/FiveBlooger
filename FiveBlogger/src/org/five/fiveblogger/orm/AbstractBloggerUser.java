package org.five.fiveblogger.orm;

import org.five.fiveblogger.orm.modul.BloggerUser;

/**
 * 抽象用户对象，提供其他属性获取
 * @author Nero
 *
 */
public abstract class AbstractBloggerUser extends BloggerUser {
	
	public abstract String findTypeName();

}
