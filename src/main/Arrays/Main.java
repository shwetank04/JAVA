package com.luv2code.hibernate.demo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String[] nemo = { "nemo" };
		GoodCode goodCode = new GoodCode();
		goodCode.findNemo(nemo);

		
		ArrayList<String> list = new ArrayList<>();
		ArrList arrList = new ArrList();
		arrList.push(list, 0, "first");
		arrList.push(list, 1, "second");
		arrList.push(list, 2, "third");
		arrList.push(list, 3, "fourth");

		System.out.println(arrList.deleteIndex(list, 1));

		Strings str = new Strings();
		System.out.println(str.reverse("Shwetank"));
		
		Array arr = new Array();
		int arr1[] = {0,3,4,31};
		int arr2[] = {4,6,30};
		arr.mergeArray(arr1, arr2);
	}

}
