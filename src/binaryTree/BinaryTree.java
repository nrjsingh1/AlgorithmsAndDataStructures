package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public Node root;


	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	public void traverseLevelOrder(Node root) {
		if (root == null)                            // Base Case
			return;
		Queue<Node> q = new LinkedList<>();        // Create an empty queue for level order traversal
		q.add(root);                                // Enqueue Root and initialize height
		while (true) {

			int nodeCount = q.size();                // nodeCount (queue size) indicates number of nodes at current level.
			if (nodeCount == 0)                        //while(true) terminated as all nodes processed
				break;

			while (nodeCount > 0) {                    // Dequeue all nodes of current level and Enqueue all nodes of next level
				Node nodeNxt = q.peek();
				System.out.print(nodeNxt.value + " ");// this will start with root
				q.remove();
				if (nodeNxt.left != null) {
					q.add(nodeNxt.left);
				}
				if (nodeNxt.right != null) {
					q.add(nodeNxt.right);
				}
				nodeCount--;
			}
			System.out.println();
		}
	}

	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

//	private Node deleteRecursive(Node root, int value){
//// 		3 cases
////		a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
////		a node has exactly one child – in the parent node, we replace this node with its only child.
////		a node has two children – this is the most complex case because it requires a tree reorganization
//
//		if(root == null){
//			return  null;
//		}
//		if(value == root.value){
//			//case 1: no children
//			if(root.left==null && root.right==null)
//				return null;
//			// Case 2: only 1 child
//			if (root.right == null) {
//				return root.left;
//			}
//
//			if (root.left == null) {
//				return root.right;
//			}
//		}
//	}

	private Node containsNodeRecursive(Node root, int value){ 			//if tree contains specific value
		if(root == null)
			return null;

		if(root.value==value)
			return root;

		return value<root.value?containsNodeRecursive(root.left,value)
				:containsNodeRecursive(root.right,value);
	}

	public boolean containsNode(int value){
		return containsNodeRecursive(root, value) != null;
	}
}
