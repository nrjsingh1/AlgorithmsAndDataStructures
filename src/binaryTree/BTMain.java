package binaryTree;

public class BTMain {
	public static void main(String[] args) {
		
		
		 BinaryTree bt = new BinaryTree();

		    bt.add(6);
		    bt.add(4);
		    bt.add(8);
		    bt.add(1);
		    
		    bt.add(3);
		    bt.add(5);
		    bt.add(7);
		    bt.add(9);
		int i =0;
		int j=0;
		i = j=20;
		bt.traverseInOrder(bt.root);
	}

}
