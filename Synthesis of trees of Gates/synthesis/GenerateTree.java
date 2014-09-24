package synthesis;

import java.util.ArrayList;
import java.util.List;

import dataholder.Gate;

public class GenerateTree {

	private Float[] pinArrival;
	private List<Tree> leafs;
	private float minDelay;

	public GenerateTree(){
		ReadingLib readingLib = new ReadingLib();
		ReadingInput readingInput = new ReadingInput();
		this.setPinArrival(readingInput.getPinArrival());
		this.setMinDelay(this.minimumDelay(readingLib.getGates()));
		this.setLeafs(this.generateNode());
	}

	public GenerateTree(String arrivalTime, String delay){
		ReadingLib readingLib = new ReadingLib();
		if(delay!=null)
			readingLib.readingLib(delay);
		else{
			Gate[] tmp = new Gate[1];
			tmp[0] = new Gate(1,1);
			readingLib.setGates(tmp);
			}
		ReadingInput readingInput = new ReadingInput(arrivalTime);
		this.setPinArrival(readingInput.getPinArrival());
		this.setMinDelay(this.minimumDelay(readingLib.getGates()));
		this.setLeafs(this.generateNode());
	}

	private float minimumDelay(Gate[] gate){
		/*Code of extracting minimum delay from the library*/
		float min = gate[0].getDelay();
		for(int i=0; i<gate.length; i++){
			if (min > gate[i].getDelay()){
				min = gate[i].getDelay();
			}
		}
		return min;
	}

	private List<Tree> generateNode(){

		List<Tree>  tmpLeaf = new ArrayList<Tree>();
		Tree tree;
		for(float s: this.getPinArrival()){
			tree = new Tree(s);
			tmpLeaf.add(tree);
		}
		return tmpLeaf;
	}

	public Float[] getPinArrival() {
		return pinArrival;
	}

	public void setPinArrival(Float[] pinArrival) {
		this.pinArrival = pinArrival;
	}


	public List<Tree> getLeafs() {
		return leafs;
	}

	public void setLeafs(List<Tree> leafs) {
		this.leafs = leafs;
	}

	public float getMinDelay() {
		return minDelay;
	}

	public void setMinDelay(float minDelay) {
		this.minDelay = minDelay;
	}

}
