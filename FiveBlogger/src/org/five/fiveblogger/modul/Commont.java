package org.five.fiveblogger.modul;

import java.util.Date;

public class Commont {
	
	private int commontId;
	private String content;
	private Date createTime;
	private String observer;
	private int likeNum;
	public int getCommontId() {
		return commontId;
	}
	public void setCommontId(int commontId) {
		this.commontId = commontId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getObserver() {
		return observer;
	}
	public void setObserver(String observer) {
		this.observer = observer;
	}
	public int getLikeNum() {
		return likeNum;
	}
	public void setLikeNum(int likeNum) {
		this.likeNum = likeNum;
	}
	
	

}
