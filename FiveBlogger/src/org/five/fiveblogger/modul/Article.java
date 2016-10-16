package org.five.fiveblogger.modul;

import java.io.Serializable;
import java.util.Date;

public class Article implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int artId;
	private String title;
	private String content;
	private String auther;
	private Date createTime;
	private Date lastUpdateTime;
	private int likeNum;
	private int readTime;
	public int getArtId() {
		return artId;
	}
	public void setArtId(int artId) {
		this.artId = artId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public int getLikeNum() {
		return likeNum;
	}
	public void setLikeNum(int likeNum) {
		this.likeNum = likeNum;
	}
	public int getReadTime() {
		return readTime;
	}
	public void setReadTime(int readTime) {
		this.readTime = readTime;
	}

	
}
