package week1.handson;


public class ReverseEvenwords {

	public static void main(String[] args) {
		//* Pseudo Code:		 
		 //* Declare the input as Follow		
	      String strText = "I am a software tester";
	      	      	 
		//a) split the words and have it in an array
	      String[] split = strText.split(" ");
	     	     	      	      
		//b) Traverse through each word (using loop)
	   for (int i = 0; i <= split.length-1; i++) {
	    // c) find the odd index within the loop (use mod operator)
	    	 if( i%2 != 0) {
	    		// d)split the words and have it in an array	x
	    		 char[] charArray = split[i].toCharArray();
	    		// e)print the even position words in reverse order using another loop (nested loop)
		    	 for (int j = charArray.length - 1; j >=0 ; j--)
		    	 {
		    		 System.out.print(charArray[j]);
	    		 
	    	 }
	    	 }
	    	  else
	    	 {
	    		 System.out.print(" " + split[i] + " ");
	    		 
	    	 }
	    	 
	    	
				
			}   	 
	    		 
	    			
	    		
	    		  }
	    	 
	    	}
	    	
	
		
		
		
		
		// f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	



//}
