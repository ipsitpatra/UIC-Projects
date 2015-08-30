     /**
 * 
 */
package utility;

import java.util.Scanner;

/** 
 * @author Ipsit
 *
 */
public class StringUtility {
	public char[][] matrixInput()
	{

		char[][] matrix;
		int row = 0, col = 0;
		Scanner read = new Scanner(System.in);
		String dimensions=read.nextLine();
		//		System.out.println(dimensions.length());
		try{

			String[] elements = dimensions.split(" "); //Splitting the values in the string into array of string 
			row = Integer.parseInt(elements[0]);
			col = Integer.parseInt(elements[1]);
			if(!(1<=row&&row<=100000) && !(1<=col&&col<=500))
			{
				read.close();
				throw new Error("Constraint failure");
			}

			String tmp[]=new String[row];
			//check constraint 
			//			System.out.println(row+" "+col);
			matrix = new char[row][col]; 
			for (int i = 0; i < row; i++) {
				dimensions=read.nextLine();
				for (int j = 0; j < col; j++) {
					if(dimensions.charAt(j)=='P'||dimensions.charAt(j)=='T')
						matrix[i][j]=dimensions.charAt(j);
					else
					{
						read.close();
						throw new Error("Value Not P or T");
					}
				}
				tmp[i]=dimensions;
			}
			return matrix;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception : "+e);
			return null;
		}finally{
			read.close();
		}


	}
}
