package com.bjsxt.pojo;

import java.io.Serializable;

/**
 * 
 * Title:博客评论表
 * @author: 代码君小飞
 * @date: 2018年6月22日 下午4:30:26
 * Description:
 */
public class BlogComment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4563697596676289239L;
	//id
	private int blogId;
	//评论人
	private String userName;
	//评论时间
	private String time;
	//文章评论总数
	private int commentNum;
	//内容
	private String Content;
	//分页对象
	private Page page;
	private String email;
	
	
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "BlogComment [blogId=" + blogId + ", userName=" + userName
				+ ", time=" + time + ", commentNum=" + commentNum
				+ ", Content=" + Content + "]";
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
