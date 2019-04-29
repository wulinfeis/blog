package com.bjsxt.util;

public class Student {
	private int id;
	private String name;
	private Grade grade;
	
	public Student(int id, String name, Grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public void ArrayTest()
	{
		Grade[]  arr =  {Grade.很差,Grade.较差,Grade.一般,Grade.中等,Grade.较好,Grade.神一般存在};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
enum Grade
{
	很差,较差,一般,中等,较好,神一般存在
}