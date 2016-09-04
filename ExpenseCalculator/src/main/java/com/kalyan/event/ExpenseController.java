package com.kalyan.event;

import java.util.ArrayList;
import java.util.List;

import com.kalyan.entity.Expense;
import com.kalyan.entity.User;

public class ExpenseController {
	
	private List<User> personList=new ArrayList<User>();;
	private List<Expense> entityList=new ArrayList<Expense>();;
	
	
	private Expense createExpenseEntity(String entityName,double totalExpenses,User source,List<User> beneficiaries){
		
		Expense entity=new Expense(entityName,totalExpenses,source,beneficiaries);
		entityList.add(entity);
		return entity;
		
	}
	
	public User createPerson(String name, String MobileNumber){
		User person=new User(name,MobileNumber,"");
		personList.add(person);
		return person;
	}
	
	public static void main(String args[]){
		new ExpenseController().addEvent();
	}
	
	
	public void addEvent(){
		
		User a=createPerson("A","123");
		User b=createPerson("B","1234");
		User c=createPerson("C","1235");
		User d=createPerson("D","1236");
		
		
		
	List<User> beneficiaries=new ArrayList(); 
	beneficiaries.add(a);
	beneficiaries.add(b);
	beneficiaries.add(c);
	beneficiaries.add(d);
	
	Expense entity=createExpenseEntity("snacks",100.00,a,beneficiaries);
	entity.calculateExpenses();
	
	
	List<User> beneficiaries2=new ArrayList(); 
	beneficiaries2.add(c);
	beneficiaries2.add(d);
	
	Expense entity1=createExpenseEntity("snacks",300.00,b,beneficiaries2);
	entity1.calculateExpenses();

	System.out.println("A  :"+a.getTotalOutStandingExpenses()+"   "+a.getIndividualPersonLevelOutstanding());
	System.out.println("B  :"+b.getTotalOutStandingExpenses()+"   "+b.getIndividualPersonLevelOutstanding());
	System.out.println("C  :"+c.getTotalOutStandingExpenses()+"   "+c.getIndividualPersonLevelOutstanding());
	System.out.println("D  :"+d.getTotalOutStandingExpenses()+"   "+d.getIndividualPersonLevelOutstanding());
	
	
		
		
		
	}

}
