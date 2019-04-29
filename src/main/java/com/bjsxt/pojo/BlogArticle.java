package com.bjsxt.pojo;

import java.io.Serializable;

/**
 * 
 * Title:博客文章类
 * @author: 代码君小飞
 * @date: 2018年6月22日
 * Description:
 */
public class BlogArticle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6067658013810664764L;
	//id
	private int blogId;
	//标题
	private String blogTitle;
	//创建时间
	private String blogCreateTime;
	//内容
	private String blogContext;
	//博客个人分类
	private String blogType;
	//博客本站分类
	private int blogStatus;
	//博客类型
	private int blogArticleType;
	//评论表对象
	private BlogComment blogComment;
	//博客浏览次数
	private int blogArticleNum; 
	private String blogImg;
	
	private Page page;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogCreateTime() {
		return blogCreateTime;
	}
	public void setBlogCreateTime(String blogCreateTime) {
		this.blogCreateTime = blogCreateTime;
	}
	public String getBlogContext() {
		return blogContext;
	}
	public void setBlogContext(String blogContext) {
		this.blogContext = blogContext;
	}
	public String getBlogType() {
		return blogType;
	}
	public void setBlogType(String blogType) {
		this.blogType = blogType;
	}
	public int getBlogStatus() {
		return blogStatus;
	}
	public void setBlogStatus(int blogStatus) {
		this.blogStatus = blogStatus;
	}
	public int getBlogArticleType() {
		return blogArticleType;
	}
	public void setBlogArticleType(int blogArticleType) {
		this.blogArticleType = blogArticleType;
	}
	public BlogComment getBlogComment() {
		return blogComment;
	}
	public void setBlogComment(BlogComment blogComment) {
		this.blogComment = blogComment;
	}
	public int getBlogArticleNum() {
		return blogArticleNum;
	}
	public void setBlogArticleNum(int blogArticleNum) {
		this.blogArticleNum = blogArticleNum;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String getBlogImg() {
		return blogImg;
	}
	public void setBlogImg(String blogImg) {
		this.blogImg = blogImg;
	}
	@Override
	public String toString() {
		return "BlogArticle [blogId=" + blogId + ", blogTitle=" + blogTitle
				+ ", blogCreateTime=" + blogCreateTime + ", blogContext="
				+ blogContext + ", blogType=" + blogType + ", blogStatus="
				+ blogStatus + ", blogArticleType=" + blogArticleType
				+ ", blogComment=" + blogComment + ", blogArticleNum="
				+ blogArticleNum + ", blogImg=" + blogImg + ", page=" + page
				+ "]";
	}

}
