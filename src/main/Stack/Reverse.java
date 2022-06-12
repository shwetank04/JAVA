	public static void pushAtBottom(int data, Stack<Integer> s) {
		if (s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data, s);
		s.push(top);
	}

	public static void reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverse(s);
		pushAtBottom(top, s);
	}
