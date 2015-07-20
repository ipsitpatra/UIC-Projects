/**
 * 
 */
package others;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class MapPhone {
	public static Map<String, String> book = new HashMap<String, String>();
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner input=new Scanner(System.in);
		int loop =Integer.parseInt(input.nextLine());
		for (int i = 0; i < loop; i++) 
			book.put(input.nextLine(), input.nextLine());
		while(input.hasNextLine()){
			String key = input.nextLine();
			String value = book.get(key);
			if (book.containsKey(key)) 
				sb.append(key+"="+value);
			else 
				sb.append("Not found");
			sb.append("\n");
		}
		input.close();
		System.out.println(sb.toString());
	}
}
