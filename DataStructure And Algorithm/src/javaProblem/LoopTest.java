/**Problem Statement

In this problem you will test your knowledge of Java loops. Given three integers a, b, and n, output the following series:

a+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
Input Format

The first line will contain the number of integers, t. Each of the next t lines will have three integers, a, b, and n.

Constraints:

0≤a,b≤50
1≤n≤15*/

package javaProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ipsit
 *
 */
public class LoopTest {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			String input;
			String count =br.readLine();
			int loop = Integer.parseInt(count);
			for (int i = 0; i < loop; i++) {
				input=br.readLine();
				String[] elements = input.split(" ");
				int a = Integer.parseInt(elements[0]);
				int b = Integer.parseInt(elements[1]);
				int n = Integer.parseInt(elements[2]);
				if(!(0<=a&&a<=50) && !(0<=b&&b<=50) && !(1<=n&&n<=15))
				{
					br.close();
					throw new Error("Constraint failure");
				}

				for (int k = 0; k < n; k++) {
					double d = 0;
					for (int j = 0; j < k+1; j++) 
						d += Math.pow(2, j)*b;
					d +=  a;
					sb.append((int)d+" ");
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());
			br.close();
		}catch(IOException io){
			io.printStackTrace();
		}	

	}


}
