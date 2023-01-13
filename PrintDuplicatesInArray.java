package week1.handson;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		int count = arr.length;
		
		System.out.println("The duplicates are : ");
				
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i <= count-1; i++) {
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int j = i + 1; j < count-1; j++) {
				// compare both the loop variables & check they're equal
				if (arr[i] == arr[j])
					// print the matching value
					System.out.println(arr[j]);			
								
						// assign 0 to count 
							
					
			}
		}
	}

}
