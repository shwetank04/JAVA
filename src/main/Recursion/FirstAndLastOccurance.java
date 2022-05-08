	public static void firstAndLastOccurance(String str, int idx, char element) {
		if (idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currChar = str.charAt(idx);
		if (currChar == element) {
			if (first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}
		firstAndLastOccurance(str, idx + 1, element);
	}
