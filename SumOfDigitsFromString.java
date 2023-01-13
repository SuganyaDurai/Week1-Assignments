package week1.handson;

public class SumOfDigitsFromString {

		public static void main(String[] args) {
		//Declare a String text with the following value
		String text = "Tes12Le79af65";		
	   //Declare a int variable sum
		 int sum = 0;
				
		
	 //* a) using replaceAll(), replace all the non-digits into ""
		String digits = text.replaceAll("[^0-9.]", "");
		System.out.println("The numbers are : "+ digits);
		
	 //* b) Now, convert the String into array
		char[] name = digits.toCharArray();
		
		// Iterate over the array and get each character
		
		for (int i = 0; i <= name.length-1; i++) 
			 {
				 //* d) Using Character.getNumericValue(), Change the char into int				
				 int numericValue = Character.getNumericValue(name[i]);
				// System.out.println(numericValue);				
				 sum = sum + numericValue;
							
			}
			//* e) Add the values to sum & print
				System.out.println("Sum of digits are :" + sum );			
			
		}
		
	 
	
	 
	}


	


