/**
 * given a string, find out the lexicographically smallest and largest substring of length k.
 */
package javaProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class LexicographicOrder {
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int subStringCount = Integer.parseInt(in.nextLine());
		in.close();
		if(input.length()<=1000 ){
			for (int i = 0; i <= input.length()-subStringCount; i++) 
				list.add(input.substring(i, i+subStringCount));
			Collections.sort(list);
			System.out.println(list.get(0)+"\n"+list.get(list.size()-1));
		}
	}
}
