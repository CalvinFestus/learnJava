package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

/*
 * [1,2,3,4,5,6]
 * [6,1,2,3,4,5]
 * [5,6,1,2,3,4]
 */

public class RotateArray {

	private int[] getRotatedArray(int[] numbers, int times) {

		int j = 0;

		for (int i = 0; i < times; i++) {			
			int temp = numbers[numbers.length-1];			
			for (j = numbers.length-1; j > 0 ; j--) {				
				numbers[j]=numbers[j-1];				
			}
			numbers[0] = temp;			
		}

		return numbers;
	}


	@Test
	public void example1() {
		int[] numbers = {1,2,3,4,5,6};
		int times = 5;
		int[] sumIndices = getRotatedArray(numbers, times);
		System.out.println(Arrays.toString(sumIndices));
	}

}
