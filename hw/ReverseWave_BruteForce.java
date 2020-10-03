package day4.hw;

import org.junit.Test;

public class ReverseWave_BruteForce {
	
	/*
	 * For odd iterations start from 0 to end.
	 * Else ove from end to 0
	 * O(N^2)
	 */
	
	private void getReverseWave(int[][] arr) {
		
		int iteration = 1;
		
		for (int i = arr.length-1; i>=0; i--) {			
			if(iteration%2 == 1) {				
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][i] + " ");
				}
			
			}else {
				for (int j = arr.length-1; j>=0; j--) {
					System.out.print(arr[j][i] + " ");
				}
			}
			iteration++;
		}

	} 




	@Test
	public void example1() {

		int arr[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } }; 

		getReverseWave(arr); 

	}

}
