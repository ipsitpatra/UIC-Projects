package javaProblem;

import java.util.Arrays;


public class StringIntersection {
	
	public static String strIntersect(String first, String second){
		StringBuilder str1= new StringBuilder(first);
		StringBuilder str2= new StringBuilder(second);
		
		String finalStr;
		char[] c;
		StringBuilder strCom= new StringBuilder();
		
		
		if(str1.length()>=str2.length()){
			
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				
				char x= str1.charAt(i);
				char y= str2.charAt(j);
				
				if((x==y)){
					
						strCom.append(x);
						
						str2.deleteCharAt(j);
						
					break;
				}
				
			}
			
		}}
		
		else if(str1.length()<str2.length()){
			for(int i=0;i<str2.length();i++){
				for(int j=0;j<str1.length();j++){
					
					char x= str2.charAt(i);
					char y= str1.charAt(j);
					
					if((x==y)){
						
							strCom.append(x);
							
							str1.deleteCharAt(j);
							
						break;
					}
					
				}
				
			}}
	c= strCom.toString().toCharArray();
	
	Arrays.sort(c);
	
	finalStr= new String(c);
		
		return finalStr;
	}

	public static void main(String[] args) {
		
		String st1= "abcdeee";
		String st2= "ebdcae";
		
		String f= strIntersect(st1, st2);
		
		System.out.println("Hello "+f);

	}

}
