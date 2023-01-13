package week1.handson;

public class Findintersection {

	public static void main(String[] args) {
		//* a) Declare An array for {3,2,11,4,6,7};	 
		
		int[] arr = {3,2,11,4,6,7};
		
		// * b) Declare another array for {1,2,8,4,9,7};
		
		int[] arr1 = {1,2,8,4,9,7};
		//* c) Declare for loop iterator from 0 to array length	
		System.out.println("The intersections are :");
		for (int i = 0; i < arr1.length; i++) {
			 //* d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i]==arr1[j]) {
					System.out.println(arr[j]);
				}
				
			}
			
		}
		 
		
		 // e) Compare Both the arrays using a condition statement

	}

}
