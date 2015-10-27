/**
 * 
 */
package algorithm.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ipsit
 *
 */
public class DuplicateNumber {



	public static void main(String[] args) {

		Integer[] arr = {1, 1, 5, 3, 8, 3, 7, 32, 32};
		System.out.println(removeDuplicates(Arrays.asList(arr)));
	}

	private static int removeDuplicates(List<Integer> numbers) {
		// your code goes here
		List<Integer> newList = new ArrayList<>();
		for (int number : numbers)
			if(!newList.contains(number)) 
				newList.add(number);
			
		return newList.size();
	}
}
