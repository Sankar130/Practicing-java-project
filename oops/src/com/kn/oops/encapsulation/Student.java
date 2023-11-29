package com.kn.oops.encapsulation;

public class Student {
	private int id;
	private String name;
	private int mark;
	private String branch;
	
	public Student(int id, String name, int mark, String branch) {
		
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.branch = branch;
	}
	public Student(int id,String name,int mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	}public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
		
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
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
