/**
 * 
 */
package algorithm.strings;

/**
 * @author Ipsit
 *
 */
public class Combination {
	public static void main(String[] args) {

		String s = "ABC";
		StringBuffer o = new StringBuffer();
		recurse( s, o, 0 );
	}

	private static void recurse(String s, StringBuffer o, int start )
	{	
		System.out.println("s : "+s+" o :"+o.toString());
		for ( int i = start; i < s.length(); i++ )
		{
			o.append(s.charAt(i));
			System.out.println( o );
			recurse( s, o, i + 1 );
			System.out.println("Removing Char:"+o.toString().charAt(o.length() - 1));
			o.deleteCharAt( o.length() - 1 );
		}
	}
}
