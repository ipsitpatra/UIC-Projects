package synthesis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import dataholder.Gate;

public class ReadingLib {


	private Gate[] gates;
	public ReadingLib(){ 

	} 



	public void readingLib(String fileName){ 
		System.out.println("Initializing the library file for the gates."); 

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			int numGates=0;
			numGates = Integer.parseInt(br.readLine());
//			System.out.println(numGates);
			this.setGates(new Gate[numGates]);
			for (int i=0; i<numGates; i++) {
				String[] tmp = br.readLine().split(" ");

				for(int j=0;j<tmp.length;j++){
					Gate tmpGate = new Gate();
					tmpGate.setDelay(Float.parseFloat(tmp[j++]));
					tmpGate.setCost(Integer.parseInt(tmp[j]));
					gates[i] = tmpGate;
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("Error Reading Library File");
			e.printStackTrace();	
		}

	} 

	public Gate[] getGates() {
		return gates;
	}

	public void setGates(Gate[] gates) {
		this.gates = gates;
	}
}