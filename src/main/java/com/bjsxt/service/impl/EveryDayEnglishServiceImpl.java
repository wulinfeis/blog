package com.bjsxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bjsxt.mapper.EveryDayEnglishMapper;
import com.bjsxt.pojo.BlogEnglishSentence;
import com.bjsxt.service.EveryDayEnglishService;
@Service("EveryDayEnglishService")
@Transactional
public class EveryDayEnglishServiceImpl implements EveryDayEnglishService{

	@Autowired
	private EveryDayEnglishMapper everyDayEnglishMapper;
	
	public BlogEnglishSentence getAll() {
		return everyDayEnglishMapper.getAll();
	}

}
