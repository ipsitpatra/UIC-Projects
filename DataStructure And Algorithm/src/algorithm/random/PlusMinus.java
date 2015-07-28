/**
 * 
 */
package algorithm.random;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class PlusMinus {

	/*  You're given an array containing integer values. You need to print the fraction of count of positive numbers,
	 *  negative numbers and zeroes to the total numbers. Print the value of the fractions correct to 3 decimal places.
	 */	
	public static void main(String[] args) {
		int N, j=0, z=0, h=0, l=0;
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		int[] list = new int[N];
		String[] tmp = in.nextLine().split(" ");
		for (int i = 0; i < tmp.length; i++) 
			list[i] = Integer.parseInt(tmp[i]);

		while (j<N)
		{
			if (list[j]>0)
				h++;
			else if (list[j]<0)
				l++;
			else
				z++;
			j++;
		}
		in.close();
		System.out.println(String.format("%.3f",(float)h/N)+"\n"+(String.format("%.3f",(float)l/N)+"\n"+(String.format("%.3f",(float)z/N))));
	}
}
