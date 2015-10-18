package javaProblem;


public class BitCount {

	public static long bits(long num){
		int count=0;
		int c=0;
		long temp=num;
		//arr= new int[32];
		while (temp > 0) {
			c++;
			temp = temp >> 1;
		}
		System.out.println(c);
		StringBuilder s= new StringBuilder();

		for(int i=0;i<c;i++){

			if((num%2)==1){
				s.append(1);
			}

			else if((num%2==0)){
				s.append(0);
			}

			num=num/2;
		}
		s.reverse();
		System.out.println(s);

		char[] a= s.toString().toCharArray();
		//return count;
		for(char i:a){
			if(i=='1'){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		long i=bits(2345678923422534738L);
		System.out.println(i);
	}

}
