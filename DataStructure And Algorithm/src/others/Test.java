package others;

import java.util.Scanner;

public class Test {
	static int answer = 0; 

	public static void main(String[] args) {
		
		Integer[][] holder = new Integer[6][6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			String tmp[] = sc.nextLine().split(" ");
			for (int j = 0; j < 6; j++) 
				holder[i][j] =  Integer.parseInt(tmp[j]);
		}
		System.out.println(hourglass(holder).toString());
		sc.close();
		

	}

	private static StringBuilder hourglass(Integer[][] holder) {
		
		StringBuilder sb = new StringBuilder();
		Integer [][]a = new Integer[16][7];
		int pos = 0;
		
		
		return sb;
	}
}
