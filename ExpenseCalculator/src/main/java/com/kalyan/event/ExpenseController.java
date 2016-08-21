package com.kalyan.event;

import java.util.ArrayList;
import java.util.List;

import com.kalyan.entity.ExpenseEntity;
import com.kalyan.entity.Person;

public class ExpenseController {
	
	private List<Person> personList=new ArrayList<Person>();;
	private List<ExpenseEntity> entityList=new ArrayList<ExpenseEntity>();;
	
	
	private ExpenseEntity createExpenseEntity(String entityName,double totalExpenses,Person source,List<Person> beneficiaries){
		
		ExpenseEntity entity=new ExpenseEntity(entityName,totalExpenses,source,beneficiaries);
		entityList.add(entity);
		return entity;
		
	}
	
	public Person createPerson(String name, String MobileNumber){
		Person person=new Person(name,MobileNumber);
		personList.add(person);
		return person;
	}
	
	public static void main(String args[]){
		new ExpenseController().addEvent();
	}
	
	
	public void addEvent(){
		
		Person a=createPerson("A","123");
		Person b=createPerson("B","1234");
		Person c=createPerson("C","1235");
		Person d=createPerson("D","1236");
		
		
		
	List<Person> beneficiaries=new ArrayList(); 
	beneficiaries.add(a);
	beneficiaries.add(b);
	beneficiaries.add(c);
	beneficiaries.add(d);
	
	ExpenseEntity entity=createExpenseEntity("snacks",100.00,a,beneficiaries);
	entity.calculateExpenses();
	
	
	List<Person> beneficiaries2=new ArrayList(); 
	beneficiaries2.add(c);
	beneficiaries2.add(d);
	
	ExpenseEntity entity1=createExpenseEntity("snacks",300.00,b,beneficiaries2);
	entity1.calculateExpenses();

	System.out.println("A  :"+a.getTotalOutStandingExpenses()+"   "+a.getIndividualPersonLevelOutstanding());
	System.out.println("B  :"+b.getTotalOutStandingExpenses()+"   "+b.getIndividualPersonLevelOutstanding());
	System.out.println("C  :"+c.getTotalOutStandingExpenses()+"   "+c.getIndividualPersonLevelOutstanding());
	System.out.println("D  :"+d.getTotalOutStandingExpenses()+"   "+d.getIndividualPersonLevelOutstanding());
	
	
		
		
		
	}

}
