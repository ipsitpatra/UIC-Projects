/**
 * 
 */
package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ipsit
 *
 */
public class Datatypes {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String input;
			String count =br.readLine();
			int loop = Integer.parseInt(count);
			for (int i = 0; i < loop; i++) {
				input=br.readLine();
				checkType(input);
			}
			br.close();
		}catch(IOException io){
			io.printStackTrace();
		}	
	}


	public static void checkType(String c){

		Byte s3 = null;
		Short s1 = null;
		Integer s2 = null;
		Long s4 = null;
		StringBuilder sb = new StringBuilder();

		try{
			s3 = Byte.valueOf(c);
			sb.append("* byte\n");
		}catch(NumberFormatException e){

		}
		try{ 
			s1 = Short.valueOf(c);
			sb.append("* short\n");
		}catch(NumberFormatException e){

		}
		try{
			s2 = Integer.parseInt(c);

			sb.append("* int\n");
		}catch(NumberFormatException e){

		}
		try{
			s4 = Long.parseLong(c);
			sb.append("* long\n");
		}catch(NumberFormatException e){

		}

		if(s1 == null && s2  == null && s3  == null &&s4 == null )
			sb.append(c + " can't be fitted anywhere.\n");
		else
			sb.insert(0,c + " can be fitted in:\n");
		System.out.print(sb.toString());
	}}
