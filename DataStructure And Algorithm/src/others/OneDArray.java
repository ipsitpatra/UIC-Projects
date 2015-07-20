package others;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner input=new Scanner(System.in);
		int loop =Integer.parseInt(input.nextLine());
		if(1<=loop && loop<=5000){
			int n,m;
			for (int i = 0; i < loop; i++){ 
				String[] tmp = input.nextLine().split(" ");
				n = Integer.parseInt(tmp[0]);
				m = Integer.parseInt(tmp[1]);
				String line = input.nextLine();
				String[] numberStrs = line.split(" ");
				int[] numbers = new int[numberStrs.length];
				for(int j = 0;j < numberStrs.length;j++)
					numbers[i] = Integer.parseInt(numberStrs[i]);

				if((2 <= n && n <= 100) && (0 <= m && m <= 100))
					game(n,m,numbers);
				else 
					break;

			}
			input.close();
			System.out.println(sb.toString());
		}

	}

	public static String game(int n , int m, int[] numbers){
		int x = 0;//position holder
		
		while(true){
		if(x!=0)
			x -= 1;
		}
		x += m;
		x += 1;
		

		return null;
	}
}
