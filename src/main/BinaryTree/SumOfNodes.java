public class BinaryTrees {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}	

public static int sumOfNodes(Node root) {
		if (root == null) {
			return 0;
		}
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);

		return leftSum + rightSum + root.data;
	}
}
