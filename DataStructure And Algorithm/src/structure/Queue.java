package structure;
/**
 * 
 */

/**
 * @author Ipsit
 *
 */
public class Queue {
	private int SIZE;         // number of elements on queue
	private Node head;    // beginning of queue
	private Node tail;     // end of queue
	/**
	 * @return the sIZE
	 */
	public int getSIZE() {
		return SIZE;
	}
	/**
	 * @param sIZE the sIZE to set
	 */
	public void setSIZE(int sIZE) {
		SIZE = sIZE;
	}
	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}
	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}
	/**
	 * @return the tail
	 */
	public Node getTail() {
		return tail;
	}
	/**
	 * @param tail the tail to set
	 */
	public void setTail(Node tail) {
		this.tail = tail;
	}

	/*Constructor*/
	public Queue() {
		head = null;
		tail  = null;
	}

	/*queue empty check*/
	public boolean isEmpty() {
		return head == null;
	}

	public void enqueue(String item) {
		/*Setting Data*/
		Node node = new Node();
		node.setData(item);
		/*Setting new Node*/
		if (isEmpty()) { 
			head = node;     
			tail = node; 
		}
		/*Adding new element to the end*/
		else{
			tail.setNext(node);
			tail = node; 
		}
		SIZE++;
	}

	public String dequeue() {
		/*Empty Check*/
		if (isEmpty()) 
			throw new RuntimeException("Queue underflow");
		
		/*Removing element fromt the head*/
		String item = head.getData();
		head = head.getNext();
		SIZE--;
		
		/*if queue get empty head and tail is empty*/
		if (isEmpty()) 
			tail = null;  
		
		return item;
	}

	
	public void printAll(){
		/*Storing the pointer in tmp variable*/
		Node tmp=head;
		/*Iterating till all the nodes are covered*/
		while(tmp!=null){
			System.out.print(tmp.getData()+" ");
			tmp=tmp.getNext();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		queue.enqueue("Ipsit");
		queue.enqueue("Patra");
		queue.enqueue("UIC");
		queue.enqueue("GA");
		queue.printAll();
		System.out.println();
		queue.dequeue();
		queue.dequeue();
		queue.printAll();
		
	}
	

}
