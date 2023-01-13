package week1.handson;

//import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		// Convert the String to character array
		char[] name = test.toCharArray();
		int length = name.length;		
		
		System.out.println("Odd index are: ");
		
		//Traverse through each character (using loop)
		for (int i = 0; i< length; i++) {			
			
//find the odd index within the loop (use mod operator)
			if (i%2!= 0) {
				char upperCase = Character.toUpperCase(name[i]);
				System.out.print(upperCase);
				
			}
			else {
				
					//char str=name[i];
					System.out.print(name[i]);
					
			}
			
			
		}
		

	}

}
