/**
 * 
 */
package sorting;

import java.util.Arrays;

/**
 * @author Ipsit
 *
 */
public class MergeSort {

	public static void merge(int[] a){
		
		int b[] = new int[a.length];
		/*invoking divide method */
		mergeSort(a, b, 0, a.length-1);
		
		
	}

	public static void mergeSort(int[] a, int[] b, int left, int right) {
		
		if(left < right){
			/*Center of the Array*/
			int center = (left+right)/2; 
			/*Breaking the left side*/
			mergeSort(a, b, left, center);
			/*Breaking the right side*/
			mergeSort(a, b, center+1, right);
			/*Merging the Divide*/
			merging(a, b, left, center+1, right);
		}
	}

	
	public static void merging(int[] a, int[] b, int left, int center, int right) {
		
		/*Left Holder*/
		int leftA = center - 1;
		/*Left position for the increment*/
		int k = left;
		/*determine the size of the array*/
		int size = right - left + 1;
		
		/*Comparing the elements and placing the element in the temp array*/
		while (left <= leftA && center <= right)
			if(a[left] <= a[center])
				b[k++] = a[left++];
			else
				b[k++] = a[center++];
		
		/*Place rest of the elements in to the tmp array*/
		while(left <= leftA)
			b[k++] = a[left++];
		
		while(center <= right)
			b[k++] = a[center++];
		
		/*Transferring elements in to the original Array*/
		for (int i = 0; i < size; i++, right--) {
			a[right] = b[right];
		}
	}
	
	public static void main(String[] args) {
		
		
		int[] a= {2,1,3,4,5,6,7};
//		int[] a = {2, 6, 3, 5, 1};
		merge(a);
		
		System.out.println(Arrays.toString(a));
		
	}
	
}
