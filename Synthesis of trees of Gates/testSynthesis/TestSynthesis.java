package testSynthesis;

import synthesis.TreeGate;

public class TestSynthesis {

	public static void main(String[] args) {
		

		if(args.length==0)
			System.out.println("Invalid Arguements.\nRequired: <pin-file> {<library-file>}");
		else	
		if(args.length==2)
			new TreeGate(args[0], args[1]);
		else  
			new TreeGate(args[0]);
		
	}

}
