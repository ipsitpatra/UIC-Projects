package com.msps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class ReadData {

	private Dictionary<Integer, String> dictCustomer = null;
	public ReadData() {
		String csv ="Copy of data.txt";
//		String csv ="data.txt";
		int counter = 0;
		String line ="";
		BufferedReader br = null;
		System.out.println("==============Reading Customer Ids and Item Ids===============");
		try {
			br = new BufferedReader(new FileReader(csv));
			dictCustomer = new Hashtable<Integer, String>();
			while((line=br.readLine()) !=null){
				//System.out.println("custID= "+cust[0]+",custItems= "+cust[1]);
				//putting values into dict
					dictCustomer.put(++counter, Utility.convert(line));
//					printValues(counter, Utility.convert(line));
				}
//			System.out.println("Size of the list : "+dictCustomer.size());
		}catch(FileNotFoundException e){
			e.printStackTrace();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void printValues(int key, String value){
		System.out.println("CustomerId : "+key+", Items : "+value);		
	}

	public static void printDict(Dictionary<String, ArrayList<String>> dict){

		Enumeration<String> enm = dict.keys();
		while (enm.hasMoreElements()) {
			String key = enm.nextElement();
			ArrayList<String> tmpList = dict.get(key);
			System.out.println("CustomerId : "+key);
			Iterator<String> itr = tmpList.iterator();
			System.out.print("Items Ids : ");
			while (itr.hasNext()) {
				String items = itr.next();
				System.out.print(items + " ");
			}System.out.println();
		}
	}

	/**
	 * @return the dictCustomer
	 */
	public Dictionary<Integer,String> getDictCustomer() {
		return dictCustomer;
	}
	/**
	 * @param dictCustomer the dictCustomer to set
	 */
	public void setDictCustomer(Dictionary<Integer,String> dictCustomer) {
		this.dictCustomer = dictCustomer;
	}

}
