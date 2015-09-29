/**
 * 
 */
package algorithm.search;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class BasicSearch {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int number = Integer.parseInt(in.nextLine());
		int size = Integer.parseInt(in.nextLine());
		String[] n = in.nextLine().split(" ");
		int[] n1 = new int[size];
		for (int i = 0; i < n.length; i++){ 
			n1[i] = Integer.parseInt(n[i]);
			if(n1[i]==number){
				System.out.println(i);
				break;
			}
		}
		in.close();
	}

}
