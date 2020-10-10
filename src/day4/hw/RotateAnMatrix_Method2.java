package day4.hw;

import org.junit.Test;

public class RotateAnMatrix_Method2 {

	private void getRotatedMatrix(int[][] arr) {

		int arrLen = arr.length;
		
		/*
		 * Transpose a matrix and reverse each row
		 * 
		 * O(N^2)
		 */

		for (int i = 0; i < arrLen; i++) 
		{ 
			for (int j = i; j < arrLen; j++) 
			{ 
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		} 

		for (int i = 0; i < arr.length; i++)
		{
			int k = arr.length-1;
			for (int j = 0; j < k; j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
				k--;
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

}
