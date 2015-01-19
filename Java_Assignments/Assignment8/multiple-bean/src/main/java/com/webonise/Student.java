package com.webonise;

public class Student {
	private String name;
	private int sno;
	private Department dept;
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void displayinfo()
	{
		System.out.println(this.getName());
		System.out.println(this.getSno());
		System.out.println(this.getDept().getDept_name());
	}
}
