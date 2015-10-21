/**
 * 
 */
package javaProblem;

import java.util.Arrays;

/**
 * @author Ipsit
 *Given three arrays A,B,C containing unsorted numbers. Find three numbers a, b, c from each of array A, B, C such that |a-b|+|b-c| +|c-a| is minimum.
 */
public class MinimizeArrays {
	public static int[] findMinRange(int[] A, int[] B, int[] C) {
		if(A == null || B == null || C== null || A.length < 1 || B.length < 1 || C.length < 1)
			return null;

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(C));
		
		int minRange = Integer.MAX_VALUE;
		int[] result = new int[3];
		int a, b, c, aPos = 0,bPos =0, cPos = 0;
		int min , max;

		while(true)
		{
			a = A[aPos];
			b = B[bPos];
			c = C[cPos];
			System.out.println("a "+a+" b: "+b+" c: "+c);
			min = Math.min(a, Math.min(b, c));
			max = Math.max(a, Math.max(b, c));
			System.out.println("minRange : "+minRange +" max-min :" +(max-min));
			if(max-min < minRange) {
				minRange = max-min;
				result[0] = a;
				result[1] = b;
				result[2] = c;
				System.out.println(Arrays.toString(result));
				System.out.println("Searching :"+(Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a)));
			}

			// increase position at minimum value, break if at the end of the array
			if(a <= b && a<= c) {
				if(aPos == A.length -1) {
					break;
				} else {
					aPos++;
				}
			} else if (b <= a && b <= c) {
				if(bPos == B.length -1) {
					break;
				} else {
					bPos++;
				}
			} else if (c <= a && c <= b) {
				if(cPos == C.length -1) {
					break;
				} else {
					cPos++;
				}
			} else {
				break;
			}
		}

		return result;
	}
	public static void main(String[] args) {

		//		int[] a = { 9, 7, 6, 8, 4, 5, 3, 1, 2 };
		//		int[] b = { 20, 4, 19, 2, 15, 17, 9, 12 };
		//		int[] c = { 3, 13, 9, 40, 25, 23, 6, 4, 5 };
		int[] a = { 9, 7, 5, 7, 4, 8, 12, 30, 50 };
		int[] b = { 30, 5, 9, 20, 35, 70, 50, 12 };
		int[] c = { 8, 10, 30, 21, 6, 3, 6, 10, 0 };

		System.out.println(Arrays.toString(findMinRange(a,b,c)));
	}
}
