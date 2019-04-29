package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.BlogArticle;
import com.bjsxt.pojo.BlogComment;
import com.bjsxt.pojo.Page;
import com.bjsxt.pojo.Users;
/**
 * 
 * Title:service层
 * @author: 代码君小飞
 * @date: 2018年6月25日 上午9:45:04
 * Description:
 */
public interface UsersService {
	
	void addUser(Users users);
	
	List<BlogArticle> getBlogHotArticle();
	/**
	 * 获取今日推荐文章
	 * @return BlogArticle对象
	 */
	BlogArticle getTodateArticle();
	/**
	 * 获取文章总数
	 * @return 文章总数
	 */
	int getAllArticle(BlogArticle blogArticles);
	/**
	 * 获取文章列表
	 * @return list 文章的集合
	 */
	List<BlogArticle> getBlogArticle(BlogArticle blogArticles);
	/**
	 * 根据文章id，查看文章具体内容
	 * @param blogId 文章id
	 * @return BlogArticle对象
	 */
	BlogArticle viewAritcle(int blogId);
	/**
	 * 获取文章的评论
	 */
	List<BlogComment> viewArticleComment(BlogComment blogComment);
	/**
	 * 新增文章评论
	 */
	void insertBlogComment(BlogComment blogComment);
	/**
	 * 保存文章
	 * @param blogArticle 文章内容
	 */
	int saveAritcle(BlogArticle blogArticle);
	/**
	 * 新增文章时，系统默认评论
	 * @param blogCreateTime 时间
	 */
	void insertComment(BlogArticle blogArticle);
	/**
	 * 新增文章时，系统默认新增浏览量
	 */
	void insertNum();
	/**
	 * 测试方法
	 * @return
	 */
	BlogArticle getTest();
}
