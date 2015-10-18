/**
 * 
 */
package algorithm.sorting;


/**
 * @author Ipsit
 *
 */
public class BubbleSort {

	public int[] bubbleSort(int[] list){

		int size = list.length;
		boolean flagChange = false;
		int tmp;
		while(size!=1){
			for (int i = 0; i < size-1; i++) {
				if(list[i]>list[i+1]){
					tmp = list[i];
					list[i]=list[i+1];
					list[i+1] = tmp;
					flagChange =true;
				}
			}
			if(!flagChange)
				break;
			size--;
			flagChange =false;
		}
		return list;
	}

	public static void main(String[] args) {

//		int[] a= {7,6,5,4,3,2,1};
		int[] a= {2,1,3,4,5,6,7};
		BubbleSort b = new BubbleSort();
		b.bubbleSort(a);
		
		for(int c:a)
			System.out.print(c+" ");

	}
}
