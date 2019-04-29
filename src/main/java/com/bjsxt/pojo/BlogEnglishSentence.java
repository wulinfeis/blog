package com.bjsxt.pojo;

import java.io.Serializable;

public class BlogEnglishSentence implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7770512687253842671L;
	private int sentenceId;
	private String English;
	private String Chinese;
	private String Time;
	private String comeFrom;
	private String comments;
	public int getSentenceId() {
		return sentenceId;
	}
	public void setSentenceId(int sentenceId) {
		this.sentenceId = sentenceId;
	}
	public String getEnglish() {
		return English;
	}
	public void setEnglish(String english) {
		English = english;
	}
	public String getChinese() {
		return Chinese;
	}
	public void setChinese(String chinese) {
		Chinese = chinese;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getComeFrom() {
		return comeFrom;
	}
	public void setComeFrom(String comeFrom) {
		this.comeFrom = comeFrom;
	}
	@Override
	public String toString() {
		return "BlogEnglishSentence [sentenceId=" + sentenceId + ", English="
				+ English + ", Chinese=" + Chinese + ", Time=" + Time
				+ ", comeFrom=" + comeFrom + "]";
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
