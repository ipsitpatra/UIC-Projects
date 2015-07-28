/**
 * 
 */
package javaProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ipsit
 *
 *
 */

/*Some times its better to use dynamic size array, java Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given n lines. In each of the line there are zero or more integers. You need to answer few queries. In each query, you need to tell the number located in yth position of xth line. 

Take your input from System.in.

Input Format
In the first line there will an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space seperated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Constraints

1<=n<=20000
0<=d<=50000
1<=q<=1000
1<=x,y<=n

Each number will fit in signed integer.
Total number of integers in n lines will not cross 100000.

Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"*/
public class ArrayListProblem {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int loop =Integer.parseInt(input.nextLine());
		ArrayList<ArrayList<String>> group = new ArrayList<ArrayList<String>>(loop);
		ArrayList<String> individual = null;
		for (int i = 0; i < loop; i++){ 
			String[] tmp = input.nextLine().split(" ");
			individual = new ArrayList<String>(Arrays.asList(tmp));
			group.add(individual);
		}
		int loop1 =Integer.parseInt(input.nextLine());
		for (int i = 0; i < loop1; i++){ 
			String[] pos = input.nextLine().split(" ");
			try{	
				sb.append(group.get(Integer.parseInt(pos[0])-1).get(Integer.parseInt(pos[1]))+"\n");
			}
			catch(IndexOutOfBoundsException e){
				sb.append("ERROR!\n");
			}
		}
		System.out.println(sb.toString());
		input.close();
	}
}
