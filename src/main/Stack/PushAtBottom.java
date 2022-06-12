	public static void pushAtBottom(int data, Stack<Integer> s) {
		if (s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data, s);
		s.push(top);
	}
