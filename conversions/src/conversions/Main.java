package conversions;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Intro
		System.out.println("This is the conversions Java Application.");
		System.out.println(" ");
		System.out.println("Please select a conversion to make...");
		System.out.println("1. Convert Fahrenheit to Celsius");
		System.out.println("2. Convert Celsius to Fahrenheit");
		
		try {
			int x = System.in.read(); //TO-DO Currently does not read the user input value correctly
		
			
			//Convert Fahrenheit to Celsius
			if (x==1 || x==49){
				
				System.out.println("Please enter a Fahrenheit temperature.");
				int y = System.in.read(); //Fahrenheit temp
				
				Temperature t = new Temperature();
				int z = t.F_to_C(y); //Celsius temp
				
				System.out.print("Your Fahrenheit temperature converts to this Celsius temperature: ");
				System.out.print(z);
			}
			
			//Convert Celsius to Fahrenheit
			//...
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
