/**
 * 
 */
package structure;

/**
 * @author Ipsit
 *
 */
public class ReverseLinkList {
	

	
	
	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();  	
		int[] a = {1,2,3,4,5,6,7,8,9};
//		int[] a = {30,4,5,6,12,4,9,34,2};
		for(int tmp : a)
			linkedList.add(tmp);
		System.out.println(linkedList.toString());


	}
}
