/**
 * 
 */
package algorithm.strings;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class FunnyString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < loop; i++) {
			funny(sc.nextLine());
		}
		sc.close();
	}
	private static void funny(String s){
		int start=0,end=s.length()-1;
		boolean flag=false;
		while(start<(s.length()-2))
		{
			int first=(int)s.charAt(start);
			int last=(int)s.charAt(end);
			int sec=(int)s.charAt(start+1);
			int sec_last=(int)s.charAt(end-1);
			if(Math.abs(first-sec)!=Math.abs(last-sec_last))
				flag=true;

			start++;
			end--;
		}

		if(flag)
			System.out.println("Funny");
		else
			System.out.println("Not Funny");

	}
}
