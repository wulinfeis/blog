package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.BlogLeaveWord;

public interface BlogLeaveWordMapper {
	void leaveWord(BlogLeaveWord blogLeaveWord);
	List<BlogLeaveWord> getLeaveWord(BlogLeaveWord blogLeaveWord);
	int getLeaveWordList();
}
