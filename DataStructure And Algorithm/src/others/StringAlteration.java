/**
 * 
 */
package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import structure.Node;

/**
 * @author Ipsit
 *
 */
public class StringAlteration {

	/*Function to Set elements in to the hash map*/
	public HashMap<Integer, Node> buildMap(Node[] node){

		HashMap<Integer, Node> returnObj = new HashMap<Integer, Node>();
		for(Node n: node)
			returnObj.put(n.getId(), n);
		return returnObj;
	}

	/*Sorting a ArrayList*/
	public ArrayList<Node> sort(ArrayList<Node> node){

		Collections.sort(node, new Comparator<Node>(){

			@Override
			public int compare(Node o1, Node o2) {
				return Integer.valueOf(o1.getId()).compareTo(o2.getId());
			}});

		return node;
	}

	/*Merging Two Arrays*/
	public Node[] mergeArray(Node[] nodeA, Node[] nodeB){

		ArrayList<Node> merge = new ArrayList<Node>();

		for (Node a: nodeA)
			merge.add(a);

		for (Node b: nodeB)
			merge.add(b);

		return (Node[]) merge.toArray();

	}

	/*Integer Input*/
	public int getIntInput(){
		Scanner in = new Scanner(System.in);
		System.out.println("Input Integer Value");
		int tmp = 0;
		tmp = in.nextInt();
		in.close();
		return tmp;
	}

	/*Float Input*/
	public float getFloatInput(){
		Scanner in = new Scanner(System.in);
		System.out.println("Input Float Value");
		float tmp = 0;
		tmp = in.nextFloat();
		in.close();
		return tmp;
	}

	/*String Input*/
	public String getStringInput(){
		Scanner in = new Scanner(System.in);
		System.out.println("Input String");
		String tmp = null;
		tmp = in.nextLine();
		in.close();
		return tmp;
	}


	/*Unique Characters*/
	public boolean isUnique(String input){


		boolean[] flags = new boolean[256];
		if(input != null)
			for(int i = 0 ; i < input.length() ; i++){
				if (flags[input.charAt(i)] != true)
					flags[input.charAt(i)] = true;
				else
					return false;
			}
		else
			return false;
		return true;
	}

	/*Reverse String C style*/
	public String reverseString(String input){
		int start = 0;
		int end = input.length()-1;
		char tmp;
		char[] inputB = input.toCharArray();
		/*StringBuilder inputA = new StringBuilder(input);
		while(start<end){
			tmp = inputA.charAt(start);
			inputA.setCharAt(start++,inputA.charAt(end)); 
			inputA.setCharAt(end--,tmp);
		}
		
		return inputA.toString();*/
		while(start<end){
			tmp = inputB[start];
			inputB[start++]=inputB[end];
			inputB[end--]=tmp;
		}
		
		return new String(inputB);
	}



	public static void main(String[] args){
		StringAlteration stringAlteration = new StringAlteration();
		System.out.println(stringAlteration.reverseString("Ipsit"));
	}

}
