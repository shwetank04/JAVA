package com.luv2code.hibernate.demo;

public class GoodCode {

	public void findNemo(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=="nemo") {
				System.out.println("Found Nemo");
			}
		}
	}
	//making more efficient
	public void findNemoEfficient(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=="nemo") {
				System.out.println("Found Nemo");
				break;
			}
		}
	}
}
