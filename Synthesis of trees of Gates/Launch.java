import synthesis.TreeGate;

/**
 * 
 */

/**
 * @author Ipsit
 *
 */
public class Launch {
public static void main(String[] args) {
	System.out.println("Project 1 CS 401 Algorithm");
	System.out.println("-----------------------------------------------");
	if(args.length==0)
		System.out.println("Invalid Arguements.\nRequired: <pin-file> {<library-file>}");
	else	
	if(args.length==2)
		new TreeGate(args[0], args[1]);
	else  
		new TreeGate(args[0]);
}
}
