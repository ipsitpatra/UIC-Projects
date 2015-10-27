/**
 * 
 */
package structure;


/**
 * @author Ipsit
 *
 */
public class LinkedList
{
	private Node head;
	private int listCount;

	public LinkedList()
	{
		head = new Node(null);
		listCount = 0;
	}

	public void add(Object data)
	{
		Node temp = new Node(data);
		Node current = head;
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(temp);
		listCount++;
	}

	public void add(Object data, int index)
	{
		Node temp = new Node(data);
		Node current = head;
		for(int i = 1; i < index && current.getNext() != null; i++)
			current = current.getNext();
		temp.setNext(current.getNext());
		current.setNext(temp);
		listCount++;
	}

	public Object get(int index)
	{
		if(index <= 0)
			return null;

		Node current = head.getNext();
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return null;

			current = current.getNext();
		}
		return current.getData();
	}

	public boolean remove(int index)
	{
		if(index < 1 || index > size())
			return false;

		Node current = head;
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return false;

			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--; 
		return true;
	}

	public int size()
	{
		return listCount;
	}

	public String toString()
	{
		Node current = head.getNext();
		String output = "";
		while(current != null)
		{
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}

	private class Node
	{
		Node next;
		Object data;

		public Node(Object _data)
		{
			next = null;
			data = _data;
		}

		public Node(Object data, Node next)
		{
			this.next = next;
			this.data = data;
		}

		public Object getData()
		{
			return data;
		}

		public void setData(Object data)
		{
			this.data = data;
		}

		public Node getNext()
		{
			return next;
		}

		public void setNext(Node next)
		{
			this.next = next;
		}
	}

	public Node reverseItrLinkedList()  
	{  
		Node currentNode = head.getNext();
		Node previousNode=null;  
		Node nextNode;  
		while(currentNode!=null)  
		{  
			
			nextNode=currentNode.next;  
			currentNode.next=previousNode;  
			previousNode=currentNode;  
			currentNode=nextNode;  
		}  
		return previousNode;  
	}  

	public Node reverseLinkedList(Node node) {  
		if (node == null || node.next == null) {  
			return node;  
		}  

		Node remaining = reverseLinkedList(node.next);  
//		System.out.println("Current : "+toString());
		node.next.next = node;  
		node.next = null;  
		return remaining;  
	}


	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();  	
		int[] a = {1,2,3,4};
//		int[] a = {1,2,3,4,5,6,7,8,9};
		for(int tmp : a)
			linkedList.add(tmp);
		System.out.println(linkedList.toString());
		linkedList.head.setNext(linkedList.reverseItrLinkedList());
		System.out.println(linkedList.toString());
		linkedList.head.setNext(linkedList.reverseLinkedList(linkedList.head.getNext()));
		System.out.println(linkedList.toString());

	}
}