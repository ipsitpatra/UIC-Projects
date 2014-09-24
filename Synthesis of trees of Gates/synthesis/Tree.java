package synthesis;

public class Tree {

	private float timeDelay;    
	private  Tree left;    
	private  Tree right;  
	private  String leaf;
	 
	public Tree(){
		
	}
	
	public Tree(float timeDelay) {

		this.timeDelay = timeDelay;
		this.left = null;
		this.right = null;
		this.leaf = "leaf";
	}

	public Tree(float timeDelay, Tree left, Tree right) {
		super();
		this.timeDelay = timeDelay;
		this.left = left;
		this.right = right;
	}

	/**
	 * @return the timeDelay
	 */
	public float getTimeDelay() {
		return timeDelay;
	}

	/**
	 * @param timeDelay the timeDelay to set
	 */
	public void setTimeDelay(float timeDelay) {
		this.timeDelay = timeDelay;
	}

	/**
	 * @return the left
	 */
	public Tree getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Tree left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Tree getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Tree right) {
		this.right = right;
	}

	/**
	 * @return the leaf
	 */
	public String getLeaf() {
		return leaf;
	}

	/**
	 * @param leaf the leaf to set
	 */
	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}


}
