/**
 * 
 */
package algorithm.random;

/**
 * @author Ipsit
 *
 */
public class NumberPalindromes {

	public static boolean palindromes(int number){

		int n = number;
		int dig;
		int rev = 0;
		while (number > 0)
		{
			dig = number % 10;
			rev = rev * 10 + dig;
			number = number / 10;
			System.out.println("rev :" +rev+" num :"+number);
		}

		System.out.println("reverse :" +rev+" number :"+n);
		if(rev == n)
			return true;
		else 
			return false;
	}


	public static void main(String[] args) {

		System.out.println(palindromes(13231));

	}

}
