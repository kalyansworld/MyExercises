package com.kalyan.entity;

import java.util.Date;
import java.util.List;

public class Expense {
	
	private String name;
	private double totalExpenses;
	private String source;
	private List<String> beneficiaries;
	private Date date;
	
	public Expense(final String entityName,final double totalExpenses,final String source,
			final List<String> beneficiaries) {
		super();
		this.name = entityName;
		this.totalExpenses = totalExpenses;
		this.source = source;
		this.beneficiaries = beneficiaries;
		this.date=new Date();
	}
	
	public Expense(final String entityName,final double totalExpenses,final String source,
			final List<String> beneficiaries,final Date date) {
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
	
	public String getSource() {
		return source;
	}

	public double getIndividualShare(){
		
		return totalExpenses/beneficiaries.size();
	}

}
