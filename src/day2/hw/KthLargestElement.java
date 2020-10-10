package day2.hw;

import java.util.Arrays;

import org.junit.Test;

public class KthLargestElement {

	private void getKthLargestElement (int[] numbers, int k) {



		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers.length; j++) {
				
				if(numbers[i]<numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j]= temp;
				}
				
			}

		}
		
		System.out.println(numbers[numbers.length-k]);
	}


	@Test
	public void example1() {
		int[] numbers = {4,3,2,7,8,2,3,1};
		int k = 3;
		System.out.println("Set 1");
		getKthLargestElement(numbers,k);
	}

	@Test
	public void example2() {
		int[] numbers = {-4,3,2,7,8,2,3,1};
		int k = 3;
		System.out.println("Set 2");
		getKthLargestElement(numbers,k);
	}

	@Test
	public void example3() {
		int[] numbers = {5,0,0,0,0,0,0,0};
		int k = 3;
		System.out.println("Set 3");
		getKthLargestElement(numbers,k);
	}

}
