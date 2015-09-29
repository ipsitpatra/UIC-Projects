package structure;

import java.io.IOException;
import java.util.Scanner;

public class BTree
{
	// Test an array with a user inputting the array string and target element.
	public static void main( String[] args ) throws IOException
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter array Size : ");//InputMismatchException
		int arraySize = in.nextInt();

		Comparable [] objArray = new Integer [ arraySize ];
		for( int i = 0; i < arraySize; i++ ){
			System.out.println("Enter value no. "+(i+1)+" :");
			objArray[ i ] = new Integer(in.nextInt());
		}
		in.close();
		for( int i = 0; i < arraySize; i++ )
			System.out.println( "Indexed at " + binarySearch( objArray, objArray[i] ) + " for " + i );
	}

	public static int binarySearch( Comparable [] objArray, Comparable searchObj )
	{
		return binarySearch( objArray, searchObj, 0, objArray.length -1 );
	}
	private static int binarySearch( Comparable [] objArray, Comparable searchObj,
			int low, int high )
	{
		while (low <= high)
		{
			int mid = ( low + high ) / 2;
			if( objArray[ mid ].compareTo( searchObj ) < 0 )
			{ 
				return binarySearch( objArray, searchObj, mid + 1, high );
			}
			else if( objArray[ mid ].compareTo( searchObj ) > 0 )
			{    
				return binarySearch( objArray, searchObj, low, mid - 1 );
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}