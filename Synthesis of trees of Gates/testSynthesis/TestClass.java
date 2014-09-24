package testSynthesis;


import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {


	public static void main(String[] args) {
		//Integer a[] = {5,6,8,9,2,4,5};
		Integer a[] = {6,3,4,7,2,5};
		//Integer a[] = {6};
		int b[] = {5,6,8,9,2,4,5,7};

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
		TestClass testClass = new TestClass();
		//System.out.println(al.get(0) +" and "+ al.get(1));
		//System.out.println(testClass.max(5, 5));
		//System.out.println("Inside int : "+testClass.subseq(b));
		//	System.out.println(".....................................");
		System.out.println("Minimum time required : "+testClass.subseqList(al));
	}

	public int max(int a, int b) { int tmp = (a > b)? a : b;  System.out.println("Max between a :"+a+" and b :"+b+" is "+tmp); return tmp;}

	public int subseqList(ArrayList<Integer> b){
		int index1=0, index2=1, sum = 0;
		if(b.size()==1){
			return b.get(0);
		}
		try{
			sum = b.get(0)+b.get(1);
			for(int i=1;i<b.size();i++){
				System.out.println("a: "+b.get(i-1)+" b: "+b.get(i)+" sum: "+ (b.get(i-1)+b.get(i)));
				if(sum > (b.get(i-1)+b.get(i))){
					sum =b.get(i-1)+b.get(i);
					index1 = i-1;
					index2 = i;
					System.out.println("Index "+ index1+" and "+index2);
				}
			}
			System.out.println("==>min: "+sum+ " for a: "+ b.get(index1)+ " and b: "+b.get(index2));
			sum = this.max(b.get(index1), b.get(index2)) + 1;

			System.out.println("Element 1 removed : "+ b.remove(index1) + " at index "+index1);
			System.out.println("Element 2 removed : "+ b.remove(index1)+ " at index "+(index1+1));
			System.out.println("New Element : "  +sum+ " at index :"+index1);
			b.add(index1, sum);
			this.printList(b);
			this.subseqList(b);
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		return b.get(0);

	}
	public void printList(ArrayList<Integer> b){

		System.out.println("List=======================================");
		for(Integer tmp: b)
			System.out.println("values : "+tmp);
		
		System.out.println("===========================================");
	}

	public int subseq(int[] b){
		try{
			int sum = b[0]+b[1];
			for(int i=1; i<b.length;i++){
				System.out.println("a: "+b[i-1]+" b: "+b[i]+" sum: "+ (b[i-1]+b[i]));
				if(sum > (b[i-1]+b[i])){
					sum = b[i-1]+b[i];
					System.out.println("Current min: "+sum);
				}
			}
			return sum;

		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		return b[0];

	}

}
