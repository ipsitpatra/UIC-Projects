package javaProblem;

import java.util.Scanner;

/**
 * @author Ipsit
 *
 */
class DivisorSum{

	public static void main(String []argh)
	{
		MyCalculator my_calculator=new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(my_calculator.divisorSum(n)+"\n");
		sc.close();

	}
	/*
	 *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
	 */
	static void ImplementedInterfaceNames(Object o)
	{

		@SuppressWarnings("rawtypes")
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++)
		{
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}
}

interface AdvancedArithmetic{
	public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	public int divisorSum(int n){
		if(n == 1)
			return 1;
		else{
			int sum = 1; 
			double m = Math.sqrt(n); 
			for (int i = 2; i <= m; i++) 
				if(n % i == 0) sum += (i + n / i); 
			return sum+n;
		} 
	}
}