/**
 * 
 */
package javaProblem;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ipsit
 *
 */
public class StringIntersectionOther {
	public static void main(String[] args) {

		String s1 = "sycheyllesysy";  
		String s2 = "sydneye";  
		ArrayList<Character> h1 = new ArrayList<Character>(), h2 = new ArrayList<Character>(), h3 = new ArrayList<Character>();
		for(int i = 0; i < s1.length(); i++)                                            
			h1.add(s1.charAt(i));
		for(int i = 0; i < s2.length(); i++)
			h2.add(s2.charAt(i));
		int size = h1.size() > h2.size() ? h1.size() : h2.size();
		for (int i = 0; i < size; i++) {
			if(h2.remove(h1.get(i))){
				h3.add(h1.get(i));
//				h1.remove(i);
//				size--;
//				i--;
			}
		}		

		Character[] res = h3.toArray(new Character[0]);
		
		Arrays.sort(res);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}


	}
}
