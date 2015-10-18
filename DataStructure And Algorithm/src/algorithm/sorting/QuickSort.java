/**
 * 
 */
package algorithm.sorting;

import java.util.Arrays;

/**
 * @author Ipsit
 *
 */
public class QuickSort {

	public static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	public static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
	public static void main(String[] args) {
		
		int[] a= {2,1,3,4,5,6,7};
//		int[] a = {2, 6, 3, 5, 1};
		
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));		
	}
}
