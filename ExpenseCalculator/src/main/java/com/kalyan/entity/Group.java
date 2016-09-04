package com.kalyan.entity;

import java.util.List;

public class Group {
	
	private String name;
	private List<User> userList;
	private List<Expense> expenseList;
	private String owner;
	private String creationDate;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<User> getUserList() {
		return userList;
	}
	
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public List<Expense> getExpenseList() {
		return expenseList;
	}
	
	public void setExpenseList(List<Expense> expenseList) {
		this.expenseList = expenseList;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	

}
