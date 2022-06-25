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
  
public static int countOfNodes(Node root) {
		if (root == null) {
			return 0;
		}
		int leftNodes = countOfNodes(root.left);
		int rightNodes = countOfNodes(root.right);

		return leftNodes + rightNodes + 1;
	}
}
