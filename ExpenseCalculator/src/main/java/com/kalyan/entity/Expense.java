package com.kalyan.entity;

import java.util.Date;
import java.util.List;

public class Expense {
	
	private String name;
	private double totalExpenses;
	private User source;
	private List<User> beneficiaries;
	private Date date;
	
	public Expense(final String entityName,final double totalExpenses,final User source,
			final List<User> beneficiaries) {
		super();
		this.name = entityName;
		this.totalExpenses = totalExpenses;
		this.source = source;
		this.beneficiaries = beneficiaries;
		this.date=new Date();
	}
	
	public Expense(final String entityName,final double totalExpenses,final User source,
			final List<User> beneficiaries,final Date date) {
		super();
		this.name = entityName;
		this.totalExpenses = totalExpenses;
		this.source = source;
		this.beneficiaries = beneficiaries;
		this.date=date;
	}
	
	public String getName() {
		return name;
	}

	public double getTotalExpenses() {
		return totalExpenses;
	}
	
	public Date getDate() {
		return date;
	}

	public void calculateExpenses(){
		
		double individualShare=totalExpenses/beneficiaries.size();
		
		//updating source with beneficiaries details
		source.addSourceExpenses(beneficiaries, individualShare);
		
		for(User person:beneficiaries){
			person.addExpenses(source.getMobile(), -individualShare);
		}
		
	}

}
