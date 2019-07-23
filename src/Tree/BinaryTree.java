package Tree;

/**
 * @author chandra Dhakite
 * Binary tree class topics covered
 * - Create/Insert the binary tree
 * - Delete the node from binary tree
 * - iterative level order traversal of the given tree using queue.
 */

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private Node root;

	BinaryTree(int key) {
		// System.out.println("Construction tree 2");
		root = new Node(key);
	}

	BinaryTree() {
		// System.out.println("Construction BinaryTree 1");
		root = null;
	}

	public static void main(String[] args) {
		// System.out.println("BinaryTree");
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(40);
		Node node20 = new Node(20);
		Node node10 = new Node(10);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);
		Node node5 = new Node(5);
		Node node13 = new Node(13);
		Node node55 = new Node(55);

		// Create/Insert the binary tree
		tree.root = tree.creteBinarytree(null, tree.root);
		tree.root = tree.creteBinarytree(tree.root, node20);
		tree.root = tree.creteBinarytree(tree.root, node10);
		tree.root = tree.creteBinarytree(tree.root, node30);
		tree.root = tree.creteBinarytree(tree.root, node60);
		tree.root = tree.creteBinarytree(tree.root, node50);
		tree.root = tree.creteBinarytree(tree.root, node70);
		tree.root = tree.creteBinarytree(tree.root, node5);
		tree.root = tree.creteBinarytree(tree.root, node13);
		tree.root = tree.creteBinarytree(tree.root, node55);

		/* transvers binary tree */
		tree.preorder(tree.root);
		// tree.inorder(tree.root);
		// tree.postorder(tree.root);

		// Delete the node
		tree.deleteNode(tree.root, 40);

		/* Print tree after deletion tree */
		tree.preorder(tree.root);
		
		// insert node using Queue as you find the first node empty
		tree.InsertNode(tree.root, 100);
		
		/* Print tree after Inserting new Node */
		tree.preorder(tree.root);

	}

	public Node creteBinarytree(Node root, Node node) {

		if (root == null && node == null) {
			return null;
		}
		if (root == null && node != null) {
			return root = node;
		}

		if (root != null && node != null) {
			if (root.data > node.data) {
				if (root.left == null)
					root.left = node;
				else
					creteBinarytree(root.left, node);
			} else if (root.data < node.data) {
				if (root.right == null) {
					root.right = node;
				} else
					creteBinarytree(root.right, node);
			}
		}
		return root;
	}

	private Node deleteNode(Node root, int newData) {

		if (root == null) {
			System.out.println("Match or root not available");
			return null;
		}
		if (root.data > newData) {
			root.left = deleteNode(root.left, newData);
		} else if (root.data < newData)
			root.right = deleteNode(root.right, newData);
		else if (root.left != null && root.right != null) {
			System.out.println("Came here");
			// if nodeToBeDeleted have both children
			Node temp = root;
			// Finding minimum element from right
			Node minNode = minNodeFromRight(temp.right);
			System.out.println("Came here" + minNode.data);
			// Replacing current node with minimum node from right subtree
			root.data = minNode.data;
			// Deleting minimum node from right now
			deleteNode(root.right, minNode.data);
		}
		// if nodeToBeDeleted has only left child
		else if (root.left != null) {
			root = root.left;
		}
		// if nodeToBeDeleted has only right child
		else if (root.right != null) {
			root = root.right;
		} else
			return root = null;

		return root;

	}

	public Node minNodeFromRight(Node temp) {
		if (temp.left == null) {
			return temp;
		} else {
			return minNodeFromRight(temp.left);
		}
	}

	/* Inorder traversal of a binary tree */
	private void inorder(Node temp) {
		if (temp == null)
			return;

		inorder(temp.left);
		System.out.println("inorder --" + temp.data);
		inorder(temp.right);

	}

	/* Inorder traversal of a binary tree */
	private void preorder(Node temp) {
		if (temp == null)
			return;

		System.out.println("preorder --" + temp.data);
		preorder(temp.left);
		preorder(temp.right);

	}

	/* Inorder traversal of a binary tree */
	private void postorder(Node temp) {
		if (temp == null)
			return;

		postorder(temp.left);
		postorder(temp.right);
		System.out.println("postorder --" + temp.data);

	}
	
	

	private void InsertNode(Node temp, int key) {

		if (temp == null)
			return;

		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);

		while (q != null) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new Node(key);
				break;
			} else
				q.add(temp.left);

			if (temp.right == null) {
				temp.right = new Node(key);
				break;

			} else
				q.add(temp.right);

		}

	}
}

class Node {
	public int data;
	public Node left, right;

	public Node(int item) {
		// System.out.println("constarcution Node ");
		this.data = item;
	}
}
