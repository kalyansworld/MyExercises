package com.kalyan.entity;

import java.util.List;

public class ExpenseEntity {
	
	private String entityName;
	private double totalExpenses;
	private Person source;
	private List<Person> beneficiaries;
	
	public ExpenseEntity(String entityName, double totalExpenses,Person source,List<Person> beneficiaries) {
		super();
		this.entityName = entityName;
		this.totalExpenses = totalExpenses;
		this.source = source;
		this.beneficiaries = beneficiaries;
	}
	
	public String getEntityName() {
		return entityName;
	}

	public double getTotalExpenses() {
		return totalExpenses;
	}

	public void calculateExpenses(){
		
		double individualShare=totalExpenses/beneficiaries.size();
		
		//updating source with beneficiaries details
		source.addSourceExpenses(beneficiaries, individualShare);
		
		for(Person person:beneficiaries){
			person.addExpenses(source.getMobile(), -individualShare);
		}
		
	}

}
