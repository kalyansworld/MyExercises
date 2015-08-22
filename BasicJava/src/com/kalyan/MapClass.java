package com.kalyan;

import java.util.Map;

import com.kalyan.maplib.KalyanHashMap;
import com.kalyan.maplib.KalyanLinkedHashMap;
import com.kalyan.maplib.KalyanTreeMap;

public class MapClass {

	public static void main(String[] args) {
		
		Map<String,String> testHashMap=new KalyanHashMap<>();
		Map<String,String> testLinkedHashMap=new KalyanLinkedHashMap<>();
		Map<String,String> testTreeHashMap=new KalyanTreeMap<>();
		
		testHashMap.put("Test1", "Test1");
		testHashMap.put("ATest1", "Test1");
		testHashMap.put("ETest1", "Test1");
		testHashMap.remove("ATest1");
		testHashMap.put("BTest1", "Test1");
		
		
		testLinkedHashMap.put("Test1", "Test1");
		testLinkedHashMap.put("ATest1", "Test1");
		testLinkedHashMap.put("ETest1", "Test1");
		testLinkedHashMap.remove("ATest1");
		testLinkedHashMap.put("BTest1", "Test1");
		
		testTreeHashMap.put("Test1", "Test1");
		testTreeHashMap.put("ATest1", "Test1");
		testTreeHashMap.put("ETest1", "Test1");
		testTreeHashMap.remove("ATest1");
		testTreeHashMap.put("BTest1", "Test1");
		
		
		System.out.println(testHashMap);
		System.out.println(testLinkedHashMap);
		System.out.println(testTreeHashMap);
	
		
		
		

	}

}
