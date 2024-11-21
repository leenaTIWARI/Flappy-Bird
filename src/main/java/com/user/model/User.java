package com.user.model;

public class User {
	
	private int unique_id;
	private String name;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int unique_id, String name) {
		super();
		this.unique_id = unique_id;
		this.name = name;
	}
	public int getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(int id) {
		this.unique_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [unique_id=" + unique_id + ", name=" + name + "]";
	}
}
