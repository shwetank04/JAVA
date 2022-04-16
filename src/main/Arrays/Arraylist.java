package com.luv2code.hibernate.demo;

import java.util.*;

public class ArrList {

	public void push(ArrayList<String> arr, int index, String element) {
		arr.add(index, element);
	}

	public void getIndex(ArrayList<String> arr, int index) {
		System.out.println(arr.get(index));
	}

	public ArrayList<String> deleteIndex(ArrayList<String> arr, int index) {
		shiftItems(arr, index);
		arr.remove(arr.size()-1);
		return arr;
	}

	public void shiftItems(ArrayList<String> inputArr, int index) {
		for (int i = index; i < inputArr.size() - 1; i++) {
//			String one = inputArr.get(i);
			inputArr.set(i, inputArr.get(i + 1));
		}
	}
}
