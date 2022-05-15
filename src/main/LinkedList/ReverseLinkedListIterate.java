public void reverseIterate() {
		Node prevNode = head;
		Node currNode = head.next;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			// update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}
