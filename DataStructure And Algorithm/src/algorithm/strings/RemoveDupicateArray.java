/**
 * 
 */
package algorithm.strings;

import java.util.Arrays;

import sorting.MergeSort;

/**
 * @author Ipsit
 *
 */
public class RemoveDupicateArray {
	public static int[] remDup(int[]a){

		MergeSort.merge(a);
		System.out.println(Arrays.toString(a));
		int count=0;
		for(int i=0;i<a.length-1;i++)
			if(a[i]==a[i+1])
				count+=1;
		int[] arr= new int[a.length-count];
		int j=1;

		for(int i=0;i<a.length;i++)
			if(i==0)
				arr[i]=a[i];
			else
				if(a[i-1]!=a[i])
					arr[j++]=a[i];
		
		return arr;
	}

	public static void main(String[] args) {
//		int[] a= {5,1,5,3,4,5};
		int[] a= {5,5,5,-5,-5,5};
		int[] ans= remDup(a);
		System.out.println(Arrays.toString(ans));
		/*		for(int i=ans.length-1;i>=0;i--)
			System.out.println(ans[i]+" ");*/

	}
}
