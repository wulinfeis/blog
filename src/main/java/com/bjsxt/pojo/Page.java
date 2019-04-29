package com.bjsxt.pojo;

import java.io.Serializable;



public class Page implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2059557800430120108L;
	private int totalCount; // 总记录数
	private int totalPage; // 总页数
	private int currentPage; // 当前页
	private int everyPage;	//每页显示数据数量
	private int beginIndex; // 查询起始点
	private int endIndex; // 查询结束点
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	public int getEveryPage() {
		return everyPage;
	}
	public void setEveryPage(int everyPage) {
		this.everyPage = everyPage;
	}

	
}
