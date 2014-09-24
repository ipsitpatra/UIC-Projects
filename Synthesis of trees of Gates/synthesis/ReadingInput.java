package synthesis;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingInput {

	private Float[] pinArrival;

	public ReadingInput(){

/*		System.out.println("Getting ready to read the Input file for the Algorithm execution."); 

		List<Float> input = new ArrayList<Float>();
		try{
			Scanner scanner = new Scanner(new File("C:\\Test\\Input.txt"));
			while(scanner.hasNextFloat())
				input.add(scanner.nextFloat());
			scanner.close();

			pinArrival = input.toArray(new Float[0]);//change

			System.out.println("Arrival pins read!");
			for(float s: pinArrival){
				System.out.println(s);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		finally{

		}
*/


	} 
	
	
	public ReadingInput( String filename){

		System.out.println("Getting ready to read the Input file for the Algorithm execution."); 

		List<Float> input = new ArrayList<Float>();
		try{
			Scanner scanner = new Scanner(new File(filename));
			scanner.nextInt();
			while(scanner.hasNextFloat())
				input.add(scanner.nextFloat());
			scanner.close();

			pinArrival = input.toArray(new Float[0]);//change

			System.out.println("Arrival pins read.");
/*			for(float s: pinArrival){
				System.out.println(s);
			}*/

		}catch(Exception e){
			System.out.println("Error Reading Input File");
			e.printStackTrace();
		}
		finally{

		}



	} 
	
	
	/*
	public void readInputFile(){
		List<Float> input = new ArrayList<Float>();
		try{
			Scanner scanner = new Scanner(new File("C:\\Test\\Input.txt"));
			while(scanner.hasNextFloat())
				input.add(scanner.nextFloat());
			scanner.close();

			pinArrival = input.toArray(new Float[0]);

			System.out.println("Arrival pins read!");
			for(float s: pinArrival){
				System.out.println(s);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		finally{

		}
	}
	 */
	public Float[] getPinArrival() {
		return pinArrival;
	}

	public void setPinArrival(Float[] pinArrival) {
		this.pinArrival = pinArrival;
	}
}