package day4.hw;

import org.junit.Test;

public class CutePrincess_BruteForce {
	
	@Test
	public void example1() {
		int[] arr = {2,4,1,1,8,7};
		int maxCoins = getMaxCoins(arr);
		System.out.println("Set 1:" + maxCoins);		
	}
	
	@Test
	public void example2() {
		int[] arr = {1,2,2,1,1,2};
		int maxCoins = getMaxCoins(arr);
		System.out.println("Set 2:" + maxCoins);
		
	}
	
	/*
	 * Sum the Odd Positions and even position and Find Max of Odd and Even Sum
	 * O(N) + O(N) = O(2N) = O(N)
	 */

	private int getMaxCoins(int[] arr) {
		
		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 1; i < arr.length; i=i+2) { //O(N)
			sumOdd = sumOdd + arr[i];
		}
		for (int i = 0; i < arr.length; i=i+2) { //O(N)
			sumEven = sumEven + arr[i];
		}
		
        return Math.max(sumOdd, sumEven);
		
	}	

}
