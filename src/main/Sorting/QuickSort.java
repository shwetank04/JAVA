// Quick Sort
	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pivotindex = partition(arr, low, high);
			quickSort(arr, low, pivotindex - 1);
			quickSort(arr, pivotindex + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i; // pivot index
	}
