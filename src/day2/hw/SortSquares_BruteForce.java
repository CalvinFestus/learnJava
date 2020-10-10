package day2.hw;

import java.util.Arrays;

import org.junit.Test;

public class SortSquares_BruteForce {
	
	private int[] getSortSquares (int[] numbers) {
	
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = numbers[i]*numbers[i];
			
		}
		
		Arrays.sort(numbers);
		return numbers;
		
	}


	@Test
	public void example1() {
		int[] numbers = {-8,-3,4,3,10}; 
		System.out.println("Set 1");
		int[] squareArray = getSortSquares(numbers);
		System.out.println(Arrays.toString(squareArray));
	}

	@Test
	public void example2() {
		int[] numbers = {-5,-4,-3,-2,-1,0};
		System.out.println("Set 2");
		int[] squareArray = getSortSquares(numbers);
		System.out.println(Arrays.toString(squareArray));
	}

}
