package synthesis;


import java.util.List;

public class TreeGate {

	private List<Tree> tree;
	private Tree root;
	private float delay;

	public float getDelay() {
		return delay;
	}

	public void setDelay(float delay) {
		this.delay = delay;
	}

	public TreeGate(){
		GenerateTree generateTree = new GenerateTree();
		this.setTree(generateTree.getLeafs());
		this.setDelay(generateTree.getMinDelay());
		this.setRoot(this.implementGates(this.getTree()));
		this.printPostOrder(this.getRoot());
	}

	public TreeGate(String arrivalTime, String delay){
		GenerateTree generateTree = new GenerateTree(arrivalTime,delay);
		this.setTree(generateTree.getLeafs());
		this.setDelay(generateTree.getMinDelay());
		System.out.println("=======================Algorithm========================");
		this.printList(this.getTree());
		this.setRoot(this.implementGates(this.getTree()));
		System.out.println("========================================================");
		System.out.println("Printing the Tree generated in postOrder Form");
		this.printPostOrder(this.getRoot());
	}

	public TreeGate(String arrivalTime) {
		System.out.println("No library file is specified, using the default library.");
		GenerateTree generateTree = new GenerateTree(arrivalTime,null);
		this.setTree(generateTree.getLeafs());
		this.setDelay(generateTree.getMinDelay());
		System.out.println("=======================Algorithm========================");
		this.printList(this.getTree());
		this.setRoot(this.implementGates(this.getTree()));
		System.out.println("========================================================");
		System.out.println("Printing the Tree generated in postOrder Form");
		this.printPostOrder(this.getRoot());
	}

	private Tree implementGates(List<Tree> tree){

		int index1=0, index2=1;
		float sum = 0;
		if(tree.size()==1){
			return tree.get(0);
		}
		try{
			sum = tree.get(0).getTimeDelay() + tree.get(1).getTimeDelay();
			for(int i=1;i<tree.size();i++){
				if(sum > (tree.get(i-1).getTimeDelay()+tree.get(i).getTimeDelay())){
					sum =tree.get(i-1).getTimeDelay()+tree.get(i).getTimeDelay();
					index1 = i-1;
					index2 = i;
				}
			}
			sum = this.max(tree.get(index1).getTimeDelay(), tree.get(index2).getTimeDelay()) + this.getDelay();
			Tree tmpTree = new Tree(sum, tree.remove(index1), tree.remove(index1));
			tmpTree.setLeaf("gate");
			tree.add(index1, tmpTree);
			this.printList(tree);
			this.implementGates(tree);
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		return tree.get(0);
	}

	public void printList(List<Tree> b){
		for(Tree tmp: b)
			System.out.print(" "+tmp.getTimeDelay());
		System.out.println();
	}

	private void printPostOrder(Tree tree){
		if ( tree != null ) { 
			printPostOrder(tree.getLeft());   
			printPostOrder(tree.getRight());  
			System.out.print(tree.getLeaf()+"("+tree.getTimeDelay()+")  "); 
		}
	}

	public List<Tree> getTree() {
		return tree;
	}

	public void setTree(List<Tree> tree) {
		this.tree = tree;
	}

	public float max(float a, float b) {
		return (a > b)? a : b;

	}


	public Tree getRoot() {
		return root;
	}

	public void setRoot(Tree root) {
		this.root = root;
	}
}
