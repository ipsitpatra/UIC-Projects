package others;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NegativeSubArrays {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		int[] holder = new int[num];
		String tmp[] = in.nextLine().split(" ");
		for (int j = 0; j < num; j++) 
			holder[j] =  Integer.parseInt(tmp[j]);
		in.close();
		System.out.println(negSubArray(holder));
	}

	public static int negSubArray(int[] input){
		String data = "";
		List<String> ans = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				data += input[j]+" ";
				ans.add(data);
			}data ="";
		}

		for (Iterator<String> iterator = ans.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			int sum=0;
			String tmp[] = string.split(" ");
			for (int j = 0; j < tmp.length; j++) 
				sum +=  Integer.parseInt(tmp[j]);
			if(sum<0)
				list.add(string);
			sum =0;
		}

		return list.size();
	}

}