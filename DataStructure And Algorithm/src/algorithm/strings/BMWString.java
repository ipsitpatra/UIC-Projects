/**
 * 
 */
package algorithm.strings;

import java.util.Arrays;

/**
 * @author Ipsit
 *
 */
public class BMWString {
	public static String test(String[] a){
		String b =null;
		if(null == a)
			return null;
		int [] a1 = new int[a.length];
		int i=0;
		for(String s: a){
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			int count =0;
			for(char c:charArray)
				if(48<=c && c<=57){
					System.out.print(c);
					count++;
				}
				else{
					a1[i] = count;
					break;
				}
			i++;
			System.out.println();
		}

		int minNum = getLongestString(a), index = 0;
		i = 0;
		for(int i1: a1){

			if(i1 < minNum){
				minNum = i1;
				index =i;
				b = a[i]; 
				System.out.println("i1 < minNum");
			}
			else if(i1 == minNum){
				if(a[i].length()>a[index].length()){
					b = a[i];
					index =i;
					System.out.println("1");
				}
				else if(a[i].length() == a[index].length()){
					b = a[index];
					System.out.println("2");
				}
			}
			i++;
		}
		System.out.println(Arrays.toString(a1));
		return b;
	}


	public static int getLongestString(String[] array) {
		int maxLength = 0;
		String longestString = null;
		for (String s : array) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				longestString = s;
			}
		}
		return longestString.length();
	}

	public static void main(String[] args) {

		String[] a = {"ipsit123","123ipsit2"}; 
		System.out.println(test(a));

	}



}
