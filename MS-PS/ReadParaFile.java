package com.msps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;

public class ReadParaFile {

	private Dictionary<String, Float> dict = null;
	private Dictionary<String, Integer> countOfMIS = null;
	private float SDC = 0;


	public ReadParaFile() {
		String txt ="Copy of para.txt";
//		String txt ="para.txt";
		String line ="";
		BufferedReader br = null;
		dict = new Hashtable<String, Float>();
		System.out.println("==============Reading Items and Support===============");
		try {
			br = new BufferedReader(new FileReader(txt));
			while((line=br.readLine()) !=null){

				if(line.toLowerCase().indexOf("sdc") >= 0){
					line =line.substring(line.indexOf("=") + 1);
					SDC = Float.parseFloat(line);
//					System.out.println("SDC : " + line);
					
				}else{
					String tmp = line;
					line = line.substring(line.indexOf("(") + 1);
					line = line.substring(0, line.indexOf(")"));
					tmp = tmp.substring(tmp.indexOf("=") + 1);
					dict.put(line, Float.parseFloat(tmp));
//					countOfMIS.put(line, Math.ceil(tmp));
//					System.out.println("Item : "+line+", Support : "+tmp);
				}
			}
			countOfMIS = Utility.countOfMIS(dict);
			System.out.println("Size of the list : "+dict.size()+" Count of MIS created of Size :"+countOfMIS.size());
		}catch(FileNotFoundException e){
			e.printStackTrace();

		}catch (IOException e) {
			e.printStackTrace();
		}


	}
	/**
	 * @return the dict
	 */
	public Dictionary<String, Float> getDict() {
		return dict;
	}

	/**
	 * @param dict the dict to set
	 */
	public void setDict(Dictionary<String, Float> dict) {
		this.dict = dict;
	}
	/**
	 * @return the sDC
	 */
	public float getSDC() {
		return SDC;
	}

	/**
	 * @param sDC the sDC to set
	 */
	public void setSDC(float sDC) {
		SDC = sDC;
	}
	/**
	 * @return the countOfMIS
	 */
	public Dictionary<String, Integer> getCountOfMIS() {
		return countOfMIS;
	}
	/**
	 * @param countOfMIS the countOfMIS to set
	 */
	public void setCountOfMIS(Dictionary<String, Integer> countOfMIS) {
		this.countOfMIS = countOfMIS;
	}

}
