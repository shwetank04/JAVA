	public boolean isPalindrome(Node head) {
		if (head == null | head.next == null) {
			return true;
		}
		Node middle = findMiddle(head);// 1st half end
		Node secondHalfStart = reverse(middle.next);
		Node firstHalfStart = head;
		while (secondHalfStart != null) {
			if (firstHalfStart.data != secondHalfStart.data) {
				return false;
			}
			firstHalfStart = firstHalfStart.next;
			secondHalfStart = secondHalfStart.next;
		}
		return true;
	}

	private Node findMiddle(Node head) {
		Node hare = head;
		Node turtle = head;
		while (hare.next != null && hare.next.next != null) {
			hare = hare.next.next;
			turtle = turtle.next;
		}
		return turtle;
	}

	public Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
