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

public static int height(Node root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		int myHeight = Math.max(leftHeight, rightHeight) + 1;
		return myHeight;
	}	

public static int diameter(Node root) {
		if (root == null) {
			return 0;
		}
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = height(root.left) + height(root.right) + 1;

		return Math.max(diam3, Math.max(diam1, diam2));
	}
}
