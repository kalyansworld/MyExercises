package com.kalyan.entity;

import java.util.LinkedList;
import java.util.List;

public class Group {
	
	private String name;
	private List<User> userList=new LinkedList<User>();
	private List<Expense> expenseList;
	private String owner;
	private String creationDate;
	
	public Group(final String groupName){
		name=groupName;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<User> getUserList() {
		return userList;
	}
	
	public void addUserList(List<User> userList) {
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
	
	public void NormalizeExpenses(){
		
	}


	public void load() {
		// TODO Auto-generated method stub
		
	}


	public boolean avail() {
		// TODO Auto-generated method stub
		return false;
	}


	public void delete() {
		// TODO Auto-generated method stub
		
	}


	public void addUsers(List<User> users) {
		// TODO Auto-generated method stub
		
	}


	public void removeUsers(List<User> users) {
		// TODO Auto-generated method stub
		
	}




}
