/**
 * 
 */
package algorithm.warmup;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class Sum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		in.nextLine();
		String[] numbers = in.nextLine().split(" ");
		int sum = 0;
		for(String a : numbers)
			sum += Integer.parseInt(a);
		System.out.println(sum);
		in.close();
	}

}
