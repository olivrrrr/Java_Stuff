
public class BinaryTree {
	private BinaryTreeNode root;
	
	/**
	 * Empty Constructor
	 */
	public BinaryTree() {
		
	}
	
	/**
	 * Construcor setting root node
	 * @param node
	 */
	public BinaryTree(BinaryTreeNode node) {
		this.root = node;
	}
	
	/**
	 * Print Tree in Pre-Order
	 */
	public void printPreorder() {
		// Mit der Wurzel beginnen
		printPreorder(root);
	}
	
	/**
	 * Print Tree in Pre-Order implementation
	 * @param tn
	 */
	private void printPreorder(BinaryTreeNode tn) {
		// Basisfall: Leerer baum
				if (tn == null)
					return ;
		// Gib den aktuellen Knoten aus
				System.out.print(tn.getEntry() + "  ");
		// Schaue linken Knoten an
				printPreorder(tn.getLeftChild());
		// Schaue rechten Konten an
				printPreorder(tn.getRightChild());
	}
	
	/**
	 * Print Tree in In-Order
	 */
	public void printInOrder() {
		printInOrder(root);
	}
	
	/**
	 * Print Tree in In-Order - implementation
	 * @param tn
	 */
	private void printInOrder(BinaryTreeNode tn) {
		if (tn == null)
			return;
		//Prüfe linkes Kind
		printInOrder(tn.getLeftChild());
		//Gib aktuellen Knoten aus
		System.out.print(tn.getEntry() + "  ");
		//Prüfe rechtes Kind
		printInOrder(tn.getRightChild());
	}
	
	/**
	 * Print Tree in Post-Order
	 */
	public void printPostOrder() {
		printPostOrder(root);
	}
	
	private void printPostOrder(BinaryTreeNode tn) {
		if (tn == null)
			return;
		
		// Prüfe linkes Kind
		printPostOrder(tn.getLeftChild());
		// Prüfe rechtes Kind
		printPostOrder(tn.getRightChild());
		// Gib aktuellen Knoten aus
		System.out.print(tn.getEntry() + "  ");
	}
	
	public boolean contains(int x) {
		return contains(root,x);
	}
	
	private boolean contains(BinaryTreeNode tn, int x) {
		
		if (tn == null || tn.getEntry() != x)
			return false;
		
//		// Prüfe aktullen Knoten
//		if (tn.getEntry() == x)
//			return true;
//		// Prüfe Linkes oder reches Kind
//			return contains(tn.getLeftChild(), x) || contains(tn.getRightChild(), x);
//		
		// Anders implementiert
		
		return contains(tn.getLeftChild(), x);
		if (tn.getEntry() == x) 
			return true;
		return contains(tn.getRightChild(), x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a searchTree
		BinarySearchTree sTree = new BinarySearchTree();
		sTree.add(7);
		sTree.add(12);
		sTree.add(20);
		sTree.add(3);
		sTree.add(5);
		sTree.add(1);
		sTree.add(6);
		sTree.add(9);
		
		sTree.printInOrder();
		System.out.println(" ist der Wert enthalten? " + sTree.contains(-1));
//		BinaryTreeNode a = new BinaryTreeNode(5);
//		BinaryTreeNode b = new BinaryTreeNode(23);
//		BinaryTreeNode c = new BinaryTreeNode(32,a,b);
//		
//		BinaryTree tree = new BinaryTree(c);
//		
//		tree.printPreorder();
//		System.out.println("\n ------------------------------ \nErzeuge Baum aus KE 6 - Seite 401 - 35.4-1");
//		
//		BinaryTreeNode d = new BinaryTreeNode(6, null, new BinaryTreeNode(5));
//		BinaryTreeNode e = new BinaryTreeNode(2, new BinaryTreeNode(9), d);
//		BinaryTreeNode f = new BinaryTreeNode(1, new BinaryTreeNode(4), new BinaryTreeNode(8));
//		BinaryTreeNode g = new BinaryTreeNode(7,e,f);
//		BinaryTree root = new BinaryTree(g);
//		
//		root.printPreorder();
//		System.out.println("\n\n Print Tree in in-order");
//		root.printInOrder();
//		System.out.println("\n\n Print Tree in Post-Order");
//		root.printPostOrder();
//		System.out.println("------ Search Pre-Order------");
////		int searchVal = 8;
////		System.out.println("Ist der Wert: " + searchVal + " im Baum?" + root.contains(searchVal));
//		
//		BinaryTreeNode a1 = new BinaryTreeNode(5, null, new BinaryTreeNode(6));
//		BinaryTreeNode a2 = new BinaryTreeNode(3, new BinaryTreeNode(1), a1);
//		BinaryTreeNode a3 = new BinaryTreeNode(12, new BinaryTreeNode(9), new BinaryTreeNode(20));
//		BinaryTreeNode a4 = new BinaryTreeNode(7, a2, a3);
//		
//		BinaryTree newTree = new BinaryTree(a4);
//		System.out.println("New Tree Pre-Order");
//		newTree.printPreorder();
//		System.out.println("\nNew Tree In-Order");
//		newTree.printInOrder();
	}

}
