package com.bjsxt.pojo;

public class Student implements Comparable<Student>{
	private String name;
	private int  age;
	
	public Student() {
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student student) {
		//小于号,排序由大到小
		//大于号,排序由小到大
		if(age < student.getAge()) {
			return 1;
		}else if(age == student.getAge()) {
			return 0;
		}
		return -1;
	}
	
	
}
