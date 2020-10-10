package day4.hw;

import java.util.Arrays;

import org.junit.Test;

public class SortColours_Method2 {
	
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
	
	
	
	private void getColoursSorted(int[] nums) {
		
		int red = 0, white = 0, blue = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				red++;
			else if (nums[i] == 1)
				white++;
			else
				blue++;
		}

		for (int i = 0; i < nums.length; i++) {
			if (red > 0) {
				nums[i] = 0;
				red--;
			} else if (white > 0) {
				nums[i] = 1;
				white--;
			} else {
				nums[i] = 2;
				blue--;
			}
		}
		
		
	}
	
	
}
