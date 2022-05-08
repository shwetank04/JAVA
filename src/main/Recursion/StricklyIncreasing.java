	public static boolean stricklyIncreasing(int arr[], int indx) {
		if (indx == arr.length - 1) {
			return true;
		}
		if (arr[indx] < arr[indx + 1]) {
			return stricklyIncreasing(arr, indx + 1);
		} else {
			return false;
		}

	}
