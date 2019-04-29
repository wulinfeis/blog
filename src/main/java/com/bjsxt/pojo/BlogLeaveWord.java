package com.bjsxt.pojo;

import java.io.Serializable;

/**
 * 留言类
 * @author Administrator
 *
 */
public class BlogLeaveWord implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5128837256415822641L;
	//留言id
	private int wordId;
	//留言内容
	private String wordContent;
	//留言状态
	private int wordStatus;
	//留言时间
	private String wordTime;
	//留言人
	private String wordPeople;
	//邮箱
	private String email;
	//分页
	private Page page;
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public int getWordId() {
		return wordId;
	}
	public void setWordId(int wordId) {
		this.wordId = wordId;
	}
	public String getWordContent() {
		return wordContent;
	}
	public void setWordContent(String wordContent) {
		this.wordContent = wordContent;
	}
	public int getWordStatus() {
		return wordStatus;
	}
	public void setWordStatus(int wordStatus) {
		this.wordStatus = wordStatus;
	}
	public String getWordTime() {
		return wordTime;
	}
	public void setWordTime(String wordTime) {
		this.wordTime = wordTime;
	}
	public String getWordPeople() {
		return wordPeople;
	}
	public void setWordPeople(String wordPeople) {
		this.wordPeople = wordPeople;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "BlogLeaveWord [wordId=" + wordId + ", wordContent="
				+ wordContent + ", wordStatus=" + wordStatus + ", wordTime="
				+ wordTime + ", wordPeople=" + wordPeople + ", email=" + email
				+ "]";
	}
	
}
