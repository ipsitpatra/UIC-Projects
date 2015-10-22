/**
 * 
 */
package algorithm.strings;

/**
 * @author Ipsit
 *
 */
public class PrintArrayAnagram {

	public static void printAnagram(String [] collection,String target)
	{
		for(int i=0;i<collection.length;i++)
			if(isAnagram(collection[i],target))
				System.out.println(collection[i]);
	}
	public static boolean isAnagram(String m,String b)
	{
		if(m.length()!=b.length())
			return false;
		int [] counts1=counts(m);
		int [] counts2=counts(b);
		for(int i=0;i<counts1.length;i++)
			if(counts1[i]!=counts2[i])
				return false;
		return true;
	}
	public static int[] counts(String m)
	{
		int[] count=new int[256];
		for(int i=0;i<count.length;i++)
			count[i]=0;
		for(int i=0;i<m.length();i++)
			count[m.charAt(i)]++;
		return count;
	}

	public static void main(String[] args) {
		String[] set = new String[]{"car","arc","art","arct","rac"}; 
		String target = "car"; 
		printAnagram(set, target);		
	}

}
