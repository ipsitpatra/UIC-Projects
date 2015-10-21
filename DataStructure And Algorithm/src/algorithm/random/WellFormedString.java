/**
 * 
 */
package algorithm.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Ipsit
 *
 */
public class WellFormedString {
	public static boolean isWellFormed(String input) {
	    if (input == null) return true;

	    Stack<Character> stack = new Stack<Character>();
	    Map<Character,Character> map = new HashMap<Character,Character>();

	    map.put('}', '{');
	    map.put(')', '(');
	    map.put(']', '[');

	    for (int i=0; i < input.length(); i++) {
	        char s = input.charAt(i);
	        if (s == '[' || s == '{' || s == '(') 
	            stack.push(s);
	        if (s == ']' || s == '}' || s == ')') 
	            if (map.get(s) != stack.pop()) 
	                return false;
	    }

	    if (!stack.isEmpty()) 
	        return false;
	    
	    else 
	        return true;
	    
	}
	
	public static void main(String[] args) {
		System.out.println(isWellFormed("A3{DJE(DG[FF]K)WA65}"));
		System.out.println(isWellFormed("BBB[BM98{WJHG]333}"));
		System.out.println(isWellFormed("CBY(DDD(WKLP)BEHOP"));
	}
	
}
