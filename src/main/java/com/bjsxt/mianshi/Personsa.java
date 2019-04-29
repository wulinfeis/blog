package com.bjsxt.mianshi;

public class Personsa {
	private String name;

	private int age;

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
	
	
	public Personsa(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 重写hashcode方法
	 */
	@Override
	public int hashCode() {
		return getName().hashCode();
	}

	/**
	 * 重写equals方法
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		/*if(((Personsa) obj).getName().equals(getName()) && ((Personsa) obj).getAge().equals(getAge())) {
			return true;
		}else {
			return false;
		}*/
		return ((Personsa) obj).getName().equals(getName());
	}
}
