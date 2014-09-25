package com.msps;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Utility {
	public static String convert(String key){
		//		System.out.println("Key :"+key);
		key = key.substring(key.indexOf("<") + 1);
		key = key.substring(0, key.indexOf(">"));
		return key;
	}

	public static String convertCBrac(String key){
		key = key.substring(key.indexOf("{") + 1);
		key = key.substring(0, key.indexOf("}"));
		return key;
	}

	public static String replace(String key){
		key = key.replaceAll("\\}\\{", ",").replaceAll(" ", "");
		return key;
	}

	public static String replaceSpace(String key){
		key = key.replaceAll(" ", "");
		return key;
	}

	public static String replaceKey(String a, String b) {
		a=Utility.replaceSpace(a);
		if(a.indexOf("{"+b+",")>=0)
			a= a.replaceAll("\\{"+b+",", "\\{");
		if(a.indexOf(","+b+"}")>=0)
			a=a.replaceAll("\\,"+b+"\\}", "\\}");
		if(a.indexOf(","+b+",")>=0)
			a=a.replaceAll("\\,"+b+"\\,", "\\,");
		if(a.indexOf("{"+b+"}")>=0)
			a=a.replaceAll("\\{"+b+"\\}", "");

		return a;
	}

	public static boolean isPresent(String key, String pattern){
		if(pattern.indexOf(" "+key+",")>=0||pattern.indexOf(" "+key+"}")>=0||pattern.indexOf("{"+key+",")>=0||pattern.indexOf("{"+key+"}")>=0)
			return true;
		else
			return false;
	}

	public static Dictionary<String, Integer> countOfMIS(Dictionary<String, Float> dict){
		Dictionary<String, Integer> count = new Hashtable<String, Integer>();
		Enumeration<String> countMIS = dict.keys();
		while (countMIS.hasMoreElements()) {
			String key = countMIS.nextElement();
			count.put(key, (int) Math.ceil(dict.size()*dict.get(key)));
		}return count;
	}

}
