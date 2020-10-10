package ds.arrays;

import org.junit.Test;

public class MaxSumConsecutiveElements {
	
private int findHighestSum (int[] numbers,int consecNum) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < consecNum; i++) {
			result = result + numbers[i];
		}
		int sum = result;
		for (int i = consecNum; i < numbers.length; i++) {
			sum = sum + numbers[i] - numbers[i-consecNum];
			result = Math.max(result, sum);			
		}
		return result;
	}


	@Test
	public void example1() {
		int[] numbers = {2,4,1,3,5,6,0,1,3,1};
		int consecNum = 3;
		int highSum = findHighestSum(numbers,consecNum);
		System.out.println(highSum);
	}
	
	@Test
	public void example2() {
		int[] numbers = {-9,4,-7,5,-6,8,};
		int consecNum = 3;
		int highSum = findHighestSum(numbers,consecNum);
		System.out.println(highSum);
	}
	
	
	@Test
	public void example3() {
		int[] numbers = {2,4,1,3,5,6,0,1,3,1};
		int consecNum = 3;
		int highSum = findHighestSum(numbers,consecNum);
		System.out.println(highSum);
	}


}
