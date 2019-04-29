package com.bjsxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.BlogArticle;
import com.bjsxt.pojo.BlogComment;
import com.bjsxt.pojo.Page;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
/**
 * 业务层
 * Title:
 * @author: 代码君小飞
 * @date: 2018年6月25日 上午9:42:08
 * Description:
 */
@Service("UsersService")
@Transactional
public class UsersServiceImpl implements UsersService {
	
	/**
	 * 自动注入
	 */
	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public void addUser(Users users) {
		this.usersMapper.insertUser(users);
	}

	
	/**
	 * 获取今日推荐文章
	 */
	@Override
	public BlogArticle getTodateArticle() {
		return usersMapper.getTodateArticle();
	}
	/**
	 * 获取文章列表
	 * @return list 文章的集合
	 */
	public List<BlogArticle> getBlogArticle(BlogArticle blogArticles){
		System.err.println("博客类型"+blogArticles.getBlogType());
		
		return usersMapper.getBlogArticle(blogArticles);
	}
	/**
	 * 查看文章内容
	 */
	@Override
	public BlogArticle viewAritcle(int blogId) {
		return usersMapper.viewAritcle(blogId);
	}
	/**
	 * 新增文章评论
	 */
	public void insertBlogComment(BlogComment blogComment){
		usersMapper.insertBlogComment(blogComment);
	}
	/**
	 * 测试一个对象中包含另一个对象的属性，用同一个对象输出
	 */
	@Override
	public BlogArticle getTest() {
		return usersMapper.getTest();
	}


	@Override
	public int saveAritcle(BlogArticle blogArticle) {
		usersMapper.saveAritcle(blogArticle);
		//新增数据之后，获取数据的id
		return  blogArticle.getBlogId();
	}


	@Override
	public void insertComment(BlogArticle blogArticle) {
		usersMapper.insertComment(blogArticle);
	}


	@Override
	public void insertNum() {
		usersMapper.insertNum();
	}


	@Override
	public int getAllArticle(BlogArticle blogArticles) {
		return usersMapper.getAllArticle(blogArticles);
	}


	@Override
	public List<BlogArticle> getBlogHotArticle() {
		return usersMapper.getBlogHotArticle();
	}


	@Override
	public List<BlogComment> viewArticleComment(BlogComment blogComment) {
		return usersMapper.viewArticleComment(blogComment);
	}



	
}
