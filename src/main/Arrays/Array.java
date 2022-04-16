package com.luv2code.hibernate.demo;

public class Array {

	public void arrayExample() {
		String[] arr = new String[4];
		arr[0] = "a";
		arr[1] = "a";
		arr[2] = "a";
		arr[3] = "a";
		// 4*4 = 16 bytes of storage

		// retrieve elements O(1)
		System.out.println(arr[2]);

		// add elements in array O(1)
		arr[4] = "e";

		// methods
		System.out.println(arr.length);
	}

	// merge sorted array
	public int[] mergeArray(int arr1[], int arr2[]) {
		int length1 = arr1.length;
		int length2 = arr2.length;
		int sortedarr[] = new int[length1 + length2];
		int i = 0, j = 0, k = 0;
		while (i < length1 && j < length2) {
			if (arr1[i] > arr2[j]) {
				sortedarr[k] = arr2[j];
				j++;
				k++;
			} else {
				sortedarr[k] = arr1[i];
				k++;
				i++;
			}
		}
		while (i < length1) {
			sortedarr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < length2) {
			sortedarr[k] = arr2[j];
			j++;
			k++;
		}

		for (int m = 0; m < sortedarr.length; m++) {
			System.out.println(sortedarr[m]);
		}
		return sortedarr;

	}

}
