package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bjsxt.pojo.BlogArticle;
import com.bjsxt.pojo.BlogComment;
import com.bjsxt.pojo.Page;
import com.bjsxt.pojo.Users;
/**
 * 
 * Title:这个类相当于以前的dao层，有没有发现，之前的dao层已经没有了，其实是被这个类给代替了
 * @author: 代码君小飞
 * @date: 2018年6月25日 上午9:46:33
 * Description:
 */
public interface UsersMapper {
	
	void insertUser(Users users);
	
	List<BlogArticle> getBlogHotArticle();
	/**
	 * 获取今日推荐文章
	 * @return
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
	 * 查看文章内容
	 * @param blogId 文章id
	 * @return BlogArticle对象
	 */
	BlogArticle viewAritcle(int blogId);
	/**
	 * 新增文章评论
	 */
	void insertBlogComment(BlogComment blogComment);
	/**
	 * 获取文章的评论
	 */
	List<BlogComment> viewArticleComment(BlogComment blogComment);
	
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
	 * 测试
	 * @return
	 */
	BlogArticle getTest();
}
