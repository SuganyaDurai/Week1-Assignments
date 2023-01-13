package week1.handson;

import java.util.Arrays;

public class MissingElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array
				Arrays.sort(arr);
				System.out.println("Sorted Array : ");					

				// loop through the array (start i from arr[0] till the length of the array)
				{
					for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i]+ ", ");
						
					}
					// check if the iterator variable is not equal to the array values respectively
				}
							
				int sum = (arr.length+1)*(arr.length+2)/2;
				for (int i = 0; i < arr.length; i++) {
					sum = sum - arr[i];
					
				}
				System.out.println();
						System.out.println("Missing elements are : " + sum);
						
					
				}

					
					
						// print the number
						
						// once printed break the iteration
						

	

	}
	





