package structure;

import java.util.NoSuchElementException;
/**
 * 
 */

/**
 * @author Ipsit
 *
 */
public class Stack {
	
	/*Size of the stack*/
	private int SIZE;
	private Node head;
	
	/*Constructor*/
	Stack(){
		head = null;
        setSIZE(0);
	}
	
	/*Push Function for the stack*/ 
    public void push(String item) {
        Node oldfirst = head;
        /*Creating new Node*/
        head = new Node();
        /*Setting Data*/
        head.setData(item);
        /*Pointing to a new Node*/
        head.setNext(oldfirst);
        setSIZE(getSIZE() + 1);
    }
	
    public String pop() {
    	/*Check of Underflow*/
        if (isEmpty())
        	throw new NoSuchElementException("Stack Empty");
        /*Extract the data*/
        String item = head.getData();       
        /*Point the head to the next element*/
        head.setNext(head.getNext());       
        /*Reduce the SIZE of the Stack*/
        SIZE--;
        return item;                  
    }
    
    /*Check if the stack is empty or Not*/
    public boolean isEmpty() {
        return head == null;
    }

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
    	Stack s = new Stack();
//    	s.pop();
    	s.push("Ipsit");
    	s.push("Patra");
    	s.push("Test");
    	System.out.println("Size :"+ s.getSIZE());
    	s.printAll();
    	s.pop();
    	s.pop();
    	s.pop();
    	System.out.println("Size :"+ s.getSIZE());
	}
	
	
}
