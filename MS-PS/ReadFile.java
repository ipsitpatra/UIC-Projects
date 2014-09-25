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

public class ReadFile {

	private Dictionary<String, ArrayList<String>> dictCustomer = null;
	public ReadFile() {
		String csv ="Customer.csv";
		String line ="";
		BufferedReader br = null;
		ArrayList<String> tmpList = null;
		System.out.println("==============Reading Customer Ids and Item Ids===============");
		try {
			br = new BufferedReader(new FileReader(csv));
			dictCustomer = new Hashtable<String,  ArrayList<String>>();
			while((line=br.readLine()) !=null){
				String[] cust = line.split(";");
				//System.out.println("custID= "+cust[0]+",custItems= "+cust[1]);
				//putting values into dict
				if(dictCustomer.get(cust[0])==null){
					ArrayList<String> items = new ArrayList<String>();
					items.add(Utility.convert(cust[1]));
					dictCustomer.put(cust[0], items);
					printValues(cust[0], Utility.convert(cust[1]));
				}else{
					tmpList =  new ArrayList<String>();
					tmpList = dictCustomer.get(cust[0]);
					tmpList.add(Utility.convert(cust[1]));
					dictCustomer.put(cust[0], tmpList);
					printValues(cust[0], Utility.convert(cust[1]));
				}
			}
			System.out.println("Size of the list : "+dictCustomer.size());
			printDict(dictCustomer);
		}catch(FileNotFoundException e){
			e.printStackTrace();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void printValues(String key, String value){
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
	public Dictionary<String, ArrayList<String>> getDictCustomer() {
		return dictCustomer;
	}
	/**
	 * @param dictCustomer the dictCustomer to set
	 */
	public void setDictCustomer(Dictionary<String, ArrayList<String>> dictCustomer) {
		this.dictCustomer = dictCustomer;
	}

}
