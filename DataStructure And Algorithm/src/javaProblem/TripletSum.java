/**
 * 
 */
package javaProblem;

import sorting.QuickSort;

/**
 * @author Ipsit
 * Find a triplet that sum to a given value
 */
public class TripletSum {
	public static boolean tripletSum(int a[], int sum)
	{
		int l, r;
		/* Sort the elements */
		QuickSort.quickSort(a, 0, a.length-1);

		for (int i = 0; i < a.length - 2; i++)
		{
			l = i + 1; // index of the first element in the remaining elements
			r = a.length-1; // index of the last element
			while (l < r)
				if( a[i] + a[l] + a[r] == sum)
				{
					System.out.printf("Triplet is %d, %d, %d", a[i], a[l], a[r]);
					return true;
				}
				else if (a[i] + a[l] + a[r] < sum)
					l++;
				else 
					r--;
		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = {1, 4, 45, 6, 10, 8};
		int sum = 22;
		System.out.println("\nTriplet Found :"+tripletSum(a, sum));
	}
}
