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
}
