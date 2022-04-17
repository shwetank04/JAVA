package com.luv2code.hibernate.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMapExample map = new HashMapExample();
		HashMap<String, String> user = new HashMap<String, String>();// Creating HashMap
		user.put("age", "54");
		user.put("name", "Kylie");
		user.put("magic", "true");
		map.returnMap(user);
//		
		int arr[] = {2,1,1,2,3,5,1,2,4};
		map.firstRecurringCharacter(arr);
		map.firstRecurringCharacterHash(arr);
    
  }
}
