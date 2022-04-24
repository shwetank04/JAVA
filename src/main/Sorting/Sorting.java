package com.luv2code.hibernate.demo;

public class Sorting {

	// Bubble Sort
//	arr [] = {7,8,3,1,2}
	public void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	// selection sort
	public void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}

	// Insertion sort
	public void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
	}

}
