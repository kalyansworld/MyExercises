package com.kalyan.entity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class User {
	
	private String name;
	private String mobile;
	private String email;
	private double totalOutstanding;
	private Map<String,Double> individualPersonLevelOutstanding; 
	
	public User(final String mobile) {
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}
	
	public String getEmail() {
		return email;
	}

	public void addExpenses(final String person,final double expense){
		
		if(individualPersonLevelOutstanding.containsKey(person)){
			individualPersonLevelOutstanding.put(person, individualPersonLevelOutstanding.get(person)+expense);
		}else{
			individualPersonLevelOutstanding.put(person, expense);
		}
		
		//neglect my expenses on total outstanding 
		if(!person.equals(this.getMobile())){
			totalOutstanding+=expense;
		}
		
	}
	
	public void addSourceExpenses(final List<User> beneficiaries,final double share){
		
		for(User person:beneficiaries){
			
			if(individualPersonLevelOutstanding.containsKey(person)){
				individualPersonLevelOutstanding.put(person.getMobile(), individualPersonLevelOutstanding.get(person)+share);
			}else{
				individualPersonLevelOutstanding.put(person.getMobile(), share);
			}
			
			if(!person.getMobile().equals(this.getMobile())){
				totalOutstanding+=share;
			}
		}
		
		
	}
	
	public double getTotalOutStandingExpenses(){
		return totalOutstanding;
	}
	
	public Map<String,Double> getIndividualPersonLevelOutstanding(){
		return individualPersonLevelOutstanding;
	}

	public void load() {
		// TODO Auto-generated method stub
		
	}

	public void updateMe(User userData) {
		// TODO Auto-generated method stub
		
	}

	public void deleteMe() {
		// TODO Auto-generated method stub
		
	}
}
