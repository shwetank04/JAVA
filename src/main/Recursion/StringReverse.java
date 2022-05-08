	public static void stringReverse(String reverse, int index) {
		if (index == 0) {
			System.out.println(reverse.charAt(index));
			return;
		}
		System.out.println(reverse.charAt(index));
		stringReverse(reverse, index - 1);
	}
