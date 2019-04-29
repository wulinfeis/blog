package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.BlogLeaveWord;

public interface BlogLeaveWordService {
	void leaveWord(BlogLeaveWord blogLeaveWord);
	List<BlogLeaveWord> getLeaveWord(BlogLeaveWord blogLeaveWord);
	int getLeaveWordList();
}
