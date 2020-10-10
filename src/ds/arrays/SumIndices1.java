package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class SumIndices1 {
	
	private int[] getSumIndices(int[] numbers, int target) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {
				
				if(numbers[i]+numbers[j]==target) {
					System.out.println("The Indices are "+i+" & "+j);
					return new int[] {i,j};
				}
				
			}
		}
		throw new RuntimeException("There is no matching indices");
	}
	
	
	@Test
	public void example1() {
		int[] numbers = {2,3,1,4,7,8};
		int target = 5;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	
	@Test
	public void example2() {
		int[] numbers = {7,-3,1,-4,8,-15};
		int target = -7;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	
	@Test
	public void example3() {
		int[] numbers = {-8,-7,1,-7,8,7};
		int target = 0;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}
	
	@Test
	public void example4() {
		int[] numbers = {5,3,8,3,4,11,4};
		int target = 10;
		int[] sumIndices = getSumIndices(numbers, target);
		System.out.println(Arrays.toString(sumIndices));
	}

}
