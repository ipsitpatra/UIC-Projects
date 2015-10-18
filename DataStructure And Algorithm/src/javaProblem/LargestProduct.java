package javaProblem;

import java.util.Arrays;

import sorting.MergeSort;


public class LargestProduct {

	public static int lp(int[] a){
//		int temp[] =a;
		int p = 0;
		//MergeSortProg mer= new MergeSortProg();
		Arrays.sort(a);
		//System.out.println(a[a.length-1]);
		if(a[a.length-1]<0){
			
			MergeSort.merge(a);
			for(int i=a.length-2; i>=0;i--){
				int t= a[a.length-1];
				
				if(t!=a[i]){
					p = t*a[i];
					//System.out.println(p);
					break;
				}
				
				else if(i==0 && a[i]==t){
					p = t*a[i];
				}
				
			}
		}
		else{
			
			for(int i=a.length-2; i>=0;i--){
				int t= a[a.length-1];
				
				if(t!=a[i]){
					p = t*a[i];
					//System.out.println(p);
					break;
				}
				else if(i==0 && a[i]==t){
					p = t*a[i];
				}
				
			}}
			return p;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {7,-4,1,-5};
		
		int x= lp(arr);
		System.out.println(x);

	}

}
