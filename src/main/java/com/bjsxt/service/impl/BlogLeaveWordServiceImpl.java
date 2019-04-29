package com.bjsxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.BlogLeaveWordMapper;
import com.bjsxt.pojo.BlogLeaveWord;
import com.bjsxt.service.BlogLeaveWordService;

@Service
public class BlogLeaveWordServiceImpl implements BlogLeaveWordService{

	@Autowired
	private BlogLeaveWordMapper blogLeaveWordMapper;
	
	public void leaveWord(BlogLeaveWord blogLeaveWord) {
		blogLeaveWordMapper.leaveWord(blogLeaveWord);
	}

	@Override
	public List<BlogLeaveWord> getLeaveWord(BlogLeaveWord blogLeaveWord) {
		return blogLeaveWordMapper.getLeaveWord(blogLeaveWord);
	}

	@Override
	public int getLeaveWordList() {
		return blogLeaveWordMapper.getLeaveWordList();
	}

}
