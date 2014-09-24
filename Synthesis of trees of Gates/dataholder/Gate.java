package dataholder;

public class Gate {

	private int cost;
	private float delay;
	
	
	public Gate(float i, int j) {
		this.cost = j;
		this.delay = i;
	}
	public Gate() {
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public float getDelay() {
		return delay;
	}
	public void setDelay(float delay) {
		this.delay = delay;
	}

	
}
