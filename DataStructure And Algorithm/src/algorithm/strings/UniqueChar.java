/**
 * 
 */
package algorithm.strings;

/**
 * @author Ipsit
 *
 */
public class UniqueChar {
	 
    public static char findFirstNonRepeatingCharacter(String str)
            throws RuntimeException {
 
        checkIfInputIsValid(str);
 
        char[] strChars = str.toCharArray();
        int length = strChars.length;
 
        for (int i = 0; i < length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < length; j++) {
 
                if (i != j && strChars[i] == strChars[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return strChars[i];
            }
        }
 
        throw new RuntimeException("All characters are repeating.");
    }
 
    private static void checkIfInputIsValid(String str) {
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("String is null or empty");
        }
    }
 
    public static void main(String[] args) {
        String str = "color";
        try {
            System.out.println("First non repeating character in the string : "
                    + findFirstNonRepeatingCharacter(str));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
