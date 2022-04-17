package com.luv2code.hibernate.demo;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapExample {

	public void createMap() {
		HashMap<String, String> user = new HashMap<String, String>();// Creating HashMap
		user.put("age", "54");
		user.put("name", "Kylie");
		user.put("magic", "true");
	}

	public void returnMap(HashMap<String, String> input) {
		System.out.println(input.get("age"));
	}

	// [2,1,1,2,3,5,1,2,4]
	//using array
	public int firstRecurringCharacter(int arr[]) {
		int i = 0, j = 0, k = 1;
		int smallestIndex = 0;
		while (i < arr.length) {
			if (arr[i] == arr[i+1]) {
				smallestIndex = arr[i];		
				System.out.println(arr[i]);
				return smallestIndex;
			}
			i++;
		}
		return 0;
	}
	
	//Using Hash Map
	public int firstRecurringCharacterHash(int arr[]) {
		HashMap<Integer,String> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i]) != null) {
				System.out.println(arr[i]);
				return arr[i];
			}
			else {
				map.put(arr[i], "input");
			}
		}
		return 1;
		
	}

}
