/**
 * 
 */
package others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Ipsit
 *
 */
public class BalancedParanthesis {

	private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
	static {
		brackets.put('[', ']');
		brackets.put('{', '}');
		brackets.put('(', ')');
	}  

	public static boolean isBalanced(String str) {
		if (str.length() == 0) 
			throw new IllegalArgumentException("Empty String");
		
		if ((str.length() % 2) != 0) 
			return false;

		final Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) 
			if (brackets.containsKey(str.charAt(i))) 
				stack.push(str.charAt(i));
			 else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) 
				return false;
		return true;
	} 

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		List<String> st = new ArrayList<String>();
		while(input.hasNextLine())
			st.add(input.nextLine());
		input.close();
		for(String s:st)
			System.out.println(isBalanced(s));
	}
}