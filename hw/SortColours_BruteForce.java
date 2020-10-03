package day4.hw;

import java.util.Arrays;

import org.junit.Test;

public class SortColours_BruteForce {
	
	@Test
	public void example1() {
		
		int[] numbers = {2,0,2,1,1,0};
		getColoursSorted(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	@Test
	public void example2() {
		
		int[] numbers = {2,0,1};
		getColoursSorted(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	@Test
	public void example3() {
		
		int[] numbers = {2,2,0,0,1,1};
		getColoursSorted(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	@Test
	public void example4() {
		
		int[] numbers = {2,0,1,2,0,1};
		getColoursSorted(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	private void getColoursSorted(int[] numbers) {
		int j=0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				j++;
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==1) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				j++;
			}
		}
	}

}
