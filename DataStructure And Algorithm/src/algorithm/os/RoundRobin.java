/**
 * 
 */
package algorithm.os;

import java.util.Arrays;

/**
 * @author Ipsit
 *
 */
public class RoundRobin {
	public static float waitingTimeRobin (int[] arrival, int[] run, int q)
	{
		int wait[] = new int[arrival.length];
		for (int i = 0; i < wait.length; i++) 
			wait[i] = 0;
		System.out.println("Arrival : "+Arrays.toString(arrival));
		System.out.println("Run     : "+Arrays.toString(run));
		System.out.println("Q       : "+q);
		System.out.println("=====================================");
		int counter = 0;
		while(!allEmpty(run)){


			for(int i=0;i<arrival.length;i++)
			{
				if(run[i]>=q)
				{
//					System.out.print("P"+(i+1)+"\t");
					for(int j=0;j<run.length;j++)
					{
						if(j==i)
							run[i]-=q;
						else if(run[j]>0)
							wait[j]+=q;
					}
				}
				else if(run[i]>0)
				{
					int time = run[i];
//					System.out.print("P"+(i+1)+"\t");
					for(int j=0;j<run.length;j++)
					{
						if(j==i)
							run[i]=0;
						else if(run[j]>0)
							wait[j]+=time;
					}
				}
				System.out.println("=====================================");
				System.out.println("Arrival : "+Arrays.toString(arrival));
				System.out.println("Run     : "+Arrays.toString(run));
				System.out.println("Wait    : "+Arrays.toString(wait));
			}


			/*			if(run[counter]-q<=0)
				run[counter] =0;
			else
				run[counter]-=q;*/
			counter = (counter+1)%arrival.length;
			//			System.out.println("=====================================");

		}
		System.out.println();
		System.out.println("=====================================");
		return 0f;
	}


	/**
	 * @param run 
	 * @return
	 */
	private static boolean allEmpty(int[] run) {
		for(int a: run)
			if(a!=0)
				return false;
		return true;
	}


	public static void main(String[] args) {
		int[] arrival={0,0,0,0};
		int[] run = {6,3,5,7};
		int q = 4;
		waitingTimeRobin(arrival,run,q);
	}
}
