package javaProblem;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Integer[][] holder = new Integer[6][6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			String tmp[] = sc.nextLine().split(" ");
			for (int j = 0; j < 6; j++) 
				holder[i][j] =  Integer.parseInt(tmp[j]);
		}

		System.out.println(hourglass(holder));
		sc.close();


	}

	private static String hourglass(Integer[][] holder) {
	/*	for (int j = 0; j < 6; j++) {
			for(int i =0 ; i < 6; i++){
				System.out.print(holder[j][i]+" ");				
			}
			System.out.println();	
		}*/

		StringBuilder sb = new StringBuilder();
		int []a ;
		int []ans = new int[7];
		int pos1 = -100;
		int pos2 = 0;
		for (int j = 0; j < 4; j++) {
			for(int i =0 ; i < 4; i++){
				a = new int[]{
						holder[j][i],
						holder[j][i+1],
						holder[j][i+2],
						holder[j+1][i+1],
						holder[j+2][i],
						holder[j+2][i+1],
						holder[j+2][i+2]};
//				System.out.println(a[0]+" "+a[1]+" "+a[2]+"\n  "+a[3]+"\n"+a[4]+" "+a[5]+" "+a[6]);
				for (int k = 0; k < a.length; k++) 
					pos2+=a[k];
//				System.out.println("Sum :"+pos2);
				if(pos2 > pos1){
					System.arraycopy( a, 0, ans, 0, a.length );
					pos1 = pos2;	
				}
				pos2= 0;
			}

		}
//		System.out.println("Ans : =====>"+pos1);
		sb.append(pos1);
//		sb.append(ans[0]+" "+ans[1]+" "+ans[2]+"\n  "+ans[3]+"\n"+ans[4]+" "+ans[5]+" "+ans[6]);
		return sb.toString();
	}


}
