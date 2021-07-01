public class BinarySearchTree {
	private BinaryTreeNode root;
	
	public void add(int x) {
		if (root == null)
			this.root = new BinaryTreeNode(x);
		else
			add(root,x);
	}
	
	/**
	 * Einfügen von neuen Knoten in den Binären Suchbaum
	 * @param tn
	 * @param x
	 */
	private void add(BinaryTreeNode tn, int x) {

		
		if (tn.getEntry() > x) {
			if (tn.getLeftChild() != null)
				add(tn.getLeftChild(), x);
			else
				tn.setLeftChild(new BinaryTreeNode(x));
		} else if ( tn.getEntry() < x) {
			if (tn.getRightChild() != null) 
				add(tn.getRightChild(), x);
			else
				tn.setRightChild(new BinaryTreeNode(x));			
		}
		
	}
	
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
	
	public boolean contains(int x) {
		return contains(root,x);
	}
	
	private boolean contains(BinaryTreeNode tn, int x) {
		if (tn == null)
			return false;
		
//		if (tn.getEntry() == x)
//			return true;
		
		if (x < tn.getEntry())
			return contains(tn.getLeftChild(), x);
		
		if (tn.getEntry() == x)
			return true;
		
		if (x > tn.getEntry())
			return contains(tn.getRightChild(), x);
		else
			return false;
		
	}
}
