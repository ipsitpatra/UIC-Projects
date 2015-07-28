/**
 * 
 */
package algorithm.random;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */

/*You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the two main diagonals.*/
public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int right = 0,left =0;
		int dim = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < dim; i++) {
			String[] tmp = sc.nextLine().split(" ");
			for (int j = 0; j < tmp.length; j++){ 
				if(i == j)
					left += Integer.parseInt(tmp[j]);
				if(i+j == (dim-1))
					right += Integer.parseInt(tmp[j]);
			}
		}
		System.out.println(Math.abs(left-right));
		sc.close();
	}
}
