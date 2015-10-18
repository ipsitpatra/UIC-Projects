package javaProblem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class FindSumIndicesPartTwo {

	public static boolean any_two_integers(int[] array, int target){ 

		int flag=0;
		for(int i=0;i<array.length;i++){
			array[i]= array[i] * 100;
		}

		Set<Integer> set = new HashSet<Integer>(array.length); 
		//System.out.println(set);
		for(int value : array){ 
			int num = target - value; // if target number is not in set then add 
			if(!set.contains(num)){ 
				set.add(value); 
				System.out.println(set); 
				flag=0;
			}else { 
				System.out.printf("(%d, %d) %n", value, num);

				flag=1; break;} 
		} 
		if(flag==1){

			return true;
		}
		else

			return false;
	} 


	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		int size= sc.nextInt();
		sc.nextLine();
		int arr[]= new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		sc.nextLine();

		int input= sc.nextInt();
		sc.nextLine();

		any_two_integers(arr, input);
		sc.close();
	}

}
