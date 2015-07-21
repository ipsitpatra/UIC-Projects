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
					numbers[j] = Integer.parseInt(numberStrs[j]);

				if((2 <= n && n <= 100) && (0 <= m && m <= 100))
					sb.append(game(n,m,numbers)+"\n");
				else 
					break;

			}
			input.close();
			System.out.println(sb.toString());
		}

	}

	public static String game(int n , int m, int[] a){
		int position = 0;
		int backMove = 0;
		while(true){
			if(position + 1 >= n || position + m >= n)
				return "YES";
			else if(a[position + m] == 0 && backMove < m){
				position += m;
				backMove = 0;
			}
			else if(a[position + 1] == 0 && backMove == 0)
				position ++;
			else if(position != 0 && a[position - 1] == 0){
				position --;
				backMove ++;
			}
			else
				return "NO";
		}
	}
}
