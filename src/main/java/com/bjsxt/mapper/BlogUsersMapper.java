package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.BlogArticle;
import com.bjsxt.pojo.BlogUser;
import com.bjsxt.pojo.Page;
import com.bjsxt.pojo.Users;
/**
 * 
 * Title:这个类相当于以前的dao层，有没有发现，之前的dao层已经没有了，其实是被这个类给代替了
 * @author: 代码君小飞
 * @date: 2018年6月25日 上午9:46:33
 * Description:
 */
public interface BlogUsersMapper {
	
	List<BlogUser> getUser(BlogUser blogUser);
}
