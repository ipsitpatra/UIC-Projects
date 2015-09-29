/**
 * 
 */
package algorithm.search;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class RightCircularRotation {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		String[] a = in.nextLine().split(" ");
		int N = Integer.parseInt(a[0]);
		int K = Integer.parseInt(a[1]);
		int Q = Integer.parseInt(a[2]);
		String[] b = in.nextLine().split(" ");
		int[] a1 = new int[N];
		for(int i = 0; i < N; ++i){
			a1[i] = Integer.parseInt(b[i]);
		}

		int offset = N - K%N;
		for(int i = 0; i < Q; ++i){
			final int X = Integer.parseInt(in.nextLine());

			sb.append(a1[(X + offset)%N] + "\n");
		}
		System.out.print(sb.toString());
		in.close();
	}

}
