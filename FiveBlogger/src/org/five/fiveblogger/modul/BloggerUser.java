package org.five.fiveblogger.modul;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "bloggerUser")
public class BloggerUser implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 749589648075890680L;
	@XmlAttribute(name = "userId")
	private int userId;
	
	@XmlAttribute(name = "userName")
	private String userName;
	
	@XmlAttribute(name = "password")
	private String password;
	
	@XmlAttribute(name = "email")
	private String email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
