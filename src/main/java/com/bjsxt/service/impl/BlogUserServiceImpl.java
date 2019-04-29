package com.bjsxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bjsxt.mapper.BlogUsersMapper;
import com.bjsxt.pojo.BlogUser;
import com.bjsxt.service.BlogUserService;
@Service
@Transactional
public class BlogUserServiceImpl  implements BlogUserService{
	
	@Autowired
	private BlogUsersMapper blogUsersMapper;
	
	@Override
	public List<BlogUser> getUser(BlogUser blogUser) {
		return blogUsersMapper.getUser(blogUser);
	}

}
