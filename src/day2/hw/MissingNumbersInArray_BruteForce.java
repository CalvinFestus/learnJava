package day2.hw;

import org.junit.Test;

public class MissingNumbersInArray_BruteForce {

	private void getMissingNumbers (int[] numbers) {

		int mininum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {

			if(mininum>numbers[i]) {
				mininum = numbers[i];
			}

			if(maximum<numbers[i]) {
				maximum = numbers[i];
			}		
		}
		System.out.println(maximum);
		System.out.println(mininum);
		
		for (int i = mininum; i <= maximum; i++) {			
			int count = 0;			
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[j]==i) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}


	@Test
	public void example1() {
		int[] numbers = {4,3,2,7,8,2,3,1};
		System.out.println("Set 1");
		getMissingNumbers(numbers);
	}

	@Test
	public void example2() {
		int[] numbers = {-4,3,2,7,8,2,3,1};
		System.out.println("Set 2");
		getMissingNumbers(numbers);
	}

	@Test
	public void example3() {
		int[] numbers = {5,0,0,0,0,0,0,0};
		System.out.println("Set 3");
		getMissingNumbers(numbers);
	}

}
