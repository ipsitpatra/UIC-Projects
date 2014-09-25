package com.msps;
/**
 * @author Ipsit and Praveen
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MSPS {

	public static void main(String[] args) {
		ReadParaFile para =new ReadParaFile(); //supp
		ReadData rd = new ReadData(); //custid
		para.getDict();
		rd.getDictCustomer();
		int count =0;
		ArrayList<String> s1 = new ArrayList<String>();
		//Extracting and counting 
		Enumeration<String> enmProduct = para.getDict().keys();
		while (enmProduct.hasMoreElements()) {
			String key = enmProduct.nextElement();
			Enumeration<Integer> enmCust = rd.getDictCustomer().keys();
			while (enmCust.hasMoreElements()) {
				Integer keyCust = enmCust.nextElement();
				String tmpList = rd.getDictCustomer().get(keyCust);
				if(Utility.isPresent(key,tmpList))
					count++;
			}
//			System.out.println("count for "+key+" is "+count );	
			float supp= (count)/((float)rd.getDictCustomer().size());
			//						System.out.println("count/para.getDict().size() :" + supp +" Value "+para.getDict().get(key));
			if(Float.compare(para.getDict().get(key), supp)<=0){	
				//				System.out.println("Key added into the Dict " +key);
				s1.add(key);//adding all the elements into S1
			}
			count =0;//re-Init the counter
		}
		Map<String, Float> tmp = new HashMap<String, Float>();;
		Iterator<String> itr = s1.iterator();
//		System.out.print("Items Ids : ");
		while (itr.hasNext()) {
			String items = itr.next();
			//			System.out.println("Item :"+items+" Value :"+para.getDict().get(items));
			tmp.put(items, para.getDict().get(items));
		}
//		System.out.println("Size :"+tmp.size());
		Map<String, Float> s1Map = sortByComparator(tmp);
		printMap(s1Map);
		//		Step 5
		ArrayList<String> sk= new ArrayList<String>();//sk insert
		for (Map.Entry<String, Float> entry : s1Map.entrySet()) {
//			System.out.println("s1 Maps Key : " + entry.getKey()+ " Value : " + entry.getValue());
			Enumeration<Integer> enmCust = rd.getDictCustomer().keys();
			while (enmCust.hasMoreElements()) {
				Integer keyCust = enmCust.nextElement();
				String tmpList = rd.getDictCustomer().get(keyCust);

				if(Utility.isPresent(entry.getKey(),tmpList))
				{
//					System.out.println("Before : "+tmpList);
					String[] keys =Utility.convertCBrac((Utility.replace(tmpList))).split(",");
					for(String key:keys){
						//						System.out.println(key+" "+entry.getKey()+" "+para.getDict().get(key)+" "+entry.getValue());
						if(para.getDict().get(key)-entry.getValue()> para.getSDC()){
							tmpList = Utility.replaceKey(tmpList, key);
						}

					}
					//					System.out.println("After  : "+tmpList);
					sk.add(tmpList);

				}
			}//code
			//			from the tmplist of ik we have to get the frequest list
			Set<String> frequestSet = new HashSet<String>();//prevent duplications
			count = 0;
			Iterator<String> skItr = sk.iterator();
			while (skItr.hasNext()) {
				if(Utility.isPresent(entry.getKey(),skItr.next()))
					count++;
			}
			if(count<para.getCountOfMIS().get(entry.getKey())){
				try{
					frequestSet.add(entry.getKey());}
				catch(Exception e){
					System.out.println("Element exits in the Set List");
				}
			}System.out.println("frequestSet : "+frequestSet.size());
			ArrayList<String> newsk = new ArrayList<String>();
			Iterator<String> freq = frequestSet.iterator();
			String tmpStr= null;
			String tmpFreq = null;
			while(skItr.hasNext()){
				while (freq.hasNext()) {
					tmpStr = skItr.next();
					tmpFreq = freq.next();
					String[] keys =Utility.convertCBrac((Utility.replace(tmpStr))).split(",");
					for(String key:keys){
						System.out.println("Key "+ key+" Freq "+tmpFreq);
						if(!key.equals(tmpFreq)){
							tmpStr = Utility.replaceKey(tmpStr, key);
						}
					}
				}
				newsk.add(tmpStr);
			}
			System.out.println("New sk :" + newsk.size());
			Iterator<String> tmpIt = newsk.iterator();
			while(tmpIt.hasNext())
				System.out.println("=>"+tmpIt.next());



			/*			=================================================================================*/


		}System.out.println("sk :" + sk.size());
	}

	private static Map<String, Float> sortByComparator(Map<String, Float> unsortMap) {
		// Convert Map to List
		List<Map.Entry<String, Float>> list = 
				new LinkedList<Map.Entry<String, Float>>(unsortMap.entrySet());
		// Sort list with comparator, to compare the Map values
		Collections.sort(list, new Comparator<Map.Entry<String, Float>>() {
			public int compare(Map.Entry<String, Float> o1,
					Map.Entry<String, Float> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		// Convert sorted map back to a Map
		Map<String, Float> sortedMap = new LinkedHashMap<String, Float>();
		for (Iterator<Map.Entry<String, Float>> it = list.iterator(); it.hasNext();) {
			Map.Entry<String, Float> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	public static void printMap(Map<String, Float> map) {
		for (Map.Entry<String, Float> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey()+ " Value : " + entry.getValue());
		}
	}
}