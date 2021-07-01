
public class BinaryTreeNode {
	
	protected int entry;
	protected BinaryTreeNode leftChild;
	protected BinaryTreeNode rightChild;
	
	/**
	 * Constructor - Create a new node without any childs
	 * @param e
	 */
	public BinaryTreeNode(int e) {
		this.entry = e;
	}

	/**
	 * Constructor - Create a new node with left and right child
	 * @param e
	 * @param left
	 * @param right
	 */
	public BinaryTreeNode(int e, BinaryTreeNode left, BinaryTreeNode right) {
		this(e);
		this.leftChild = left;
		this.rightChild = right;
	}

	
	// Getter and Setter

	/**
	 * Return entry from a specific node ( integer)
	 * @return the entry
	 */
	public int getEntry() {
		return entry;
	}


	/**
	 * Set an entry for a specific node ( integer )
	 * @param entry the entry to set
	 */
	public void setEntry(int entry) {
		this.entry = entry;
	}


	/**
	 * Return the left Child - BinaryTreeNode
	 * @return the leftChild
	 */
	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}


	/**
	 * Set the left child - BinaryTreeNode
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}


	/**
	 * Return the right child of a specific node - BinaryTreeNode
	 * @return the rightChild
	 */
	public BinaryTreeNode getRightChild() {
		return rightChild;
	}


	/**
	 * Set the right child of a specific node
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	

	
	
}
