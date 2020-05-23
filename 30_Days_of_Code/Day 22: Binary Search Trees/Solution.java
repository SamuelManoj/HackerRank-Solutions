import java.util.*;
import java.io.*;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class Solution {

	public static int getHeight(Node root) {
		// Write your code here
		int leftheight = 0, rightheight = 0;

		if (root.left != null) {
			leftheight = getHeight(root.left) + 1;
		}
		if (root.right != null) {
			rightheight = getHeight(root.right) + 1;
		}

		return (leftheight > rightheight ? leftheight : rightheight);
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}
