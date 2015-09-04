/**
 * 
 */
package algorithm.warmup;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class Staircase {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		for(int i =1;i<=size;i++){
			int tmp =i;
			while(tmp<=size-1)
			{
				System.out.print(" ");
				tmp++;
			}
			tmp=i;
			while(tmp>0){
				System.out.print("#");
				tmp--;
			}
			System.out.println();
		}
		in.close();

	}
}
