package com.msps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;

public class ReadSettingFile {

	private Dictionary<String, String> dict = null;
	
	/**
	 * @return the dict
	 */
	public Dictionary<String, String> getDict() {
		return dict;
	}

	/**
	 * @param dict the dict to set
	 */
	public void setDict(Dictionary<String, String> dict) {
		this.dict = dict;
	}

	public ReadSettingFile() {
		String csv ="Items.csv";
		String line ="";
		BufferedReader br = null;
		dict = new Hashtable<String, String>();
		System.out.println("==============Reading Items and Support===============");
		try {
			br = new BufferedReader(new FileReader(csv));
			while((line=br.readLine()) !=null){

				String[] item = line.split(";");
//				System.out.println("Item : "+item[0]+", Support : "+item[1]);
				//putting values into dict
				dict.put(item[0], item[1]);
			}

		}catch(FileNotFoundException e){
			e.printStackTrace();

		}catch (IOException e) {
			e.printStackTrace();
		}


	}

}
