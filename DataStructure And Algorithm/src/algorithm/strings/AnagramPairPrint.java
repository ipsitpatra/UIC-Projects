/**
 * 
 */
package algorithm.strings;

import java.util.Arrays;

/**
 * @author Ipsit
 *
 */
public class AnagramPairPrint {
	/* function to check whether two strings are anagram of each other */
	public static boolean isAnagram(String m,String b)
	{
		char[] m1 = m.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(m1);
		Arrays.sort(b1);
		if(String.valueOf(m1).equals(String.valueOf(b1)))
			return true;
		else 
			return false;

	}

	// This function prints all anagram pairs in a given array of strings
	public static void findAllAnagrams(String arr[], int n)
	{
		for (int i = 0; i < n; i++)
			for (int j = i+1; j < n; j++)
				if (isAnagram(arr[i], arr[j]))
					System.out.println(arr[i]+" is anagram of "+arr[j]);
	}


	public static void main(String[] args) {

		String arr[] = {"asdd", "ddsa", "abcd", 
				"tipsi", "ipsit", "dcab", "dbab"};
		findAllAnagrams(arr, arr.length);
	}
}
