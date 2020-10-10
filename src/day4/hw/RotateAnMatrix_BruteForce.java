package day4.hw;

import org.junit.Test;

public class RotateAnMatrix_BruteForce {

	private void getRotatedMatrix(int[][] arr) {

		int arrLen = arr.length;
		
		/*
		 * Swap the Corners, Then each element till arrlen/2 Times
		 * 
		 * O(N^2)
		 */

		for (int i = 0; i < arrLen / 2; i++) 
		{ 
			for (int j = i; j < arrLen - i - 1; j++) 
			{ 
				int temp = arr[i][j]; 
				arr[i][j] = arr[arrLen - 1 - j][i]; 
				arr[arrLen - 1 - j][i] = arr[arrLen - 1 - i][arrLen - 1 - j]; 
				arr[arrLen - 1 - i][arrLen - 1 - j] = arr[j][arrLen - 1 - i]; 
				arr[j][arrLen - 1 - i] = temp; 
			} 
		} 


		for (int i = 0; i < arrLen; i++) 
		{ 
			for (int j = 0; j < arrLen; j++) 
				System.out.print( arr[i][j] + " "); 
			
			System.out.println(); 
		} 

	} 




	@Test
	public void example1() {

		int arr[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } }; 
		getRotatedMatrix(arr); 

	}
	
	@Test
	public void example2() {

		int arr[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } }; 
		getRotatedMatrix(arr); 

	}

}
