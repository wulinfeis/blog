package com.bjsxt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.TestMapper;
import com.bjsxt.service.TestService;
@Service
public class TestServiceImpl implements TestService {

		
	@Autowired
	private TestMapper testMapper;
	
	public void insertUser(Map map) {
		testMapper.insertUser(map);
	}

	@Override
	public List getUserList() {
		return testMapper.getUserList();
	}

}
