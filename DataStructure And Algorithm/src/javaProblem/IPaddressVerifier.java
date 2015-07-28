/**
 * 
 */
package javaProblem;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
public class IPaddressVerifier {

	private static final String IPADDRESS_PATTERN = 
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";	


	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String IP = in.next();
			System.out.println(IP.matches(IPADDRESS_PATTERN));
		}
		in.close();
	}
}