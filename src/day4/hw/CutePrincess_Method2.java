package day4.hw;

import org.junit.Test;

public class CutePrincess_Method2 {

	@Test
	public void example1() {
		int[] arr = {2,4,1,1,8,7};
		int maxCoins = getMaxCoins(arr);
		System.out.println("Set 1:" + maxCoins);		
	}

	@Test
	public void example2() {
		int[] arr = {4,1,1,10};
		int maxCoins = getMaxCoins(arr);
		System.out.println("Set 2:" + maxCoins);

	}
	
	/*
	 * Iterate the Array and add Max of N-1th Element and Sum of (N-2) + Current Element
	 * Last Element will the max value
	 * 
	 * O(1) + O(1) + O(1) + O(N) = O(N) 
	 */

	private int getMaxCoins(int[] arr) {

		int[] fin = new int[arr.length];

		if(arr.length>=1) { //O(1)
			fin[0] = arr[0];
		}
		if(arr.length>=2) { //O(1)
			fin[1] = (arr[0]>arr[1]) ? arr[0] : arr[1];
		}
		if(arr.length>=3) { //O(1)
			for (int i = 2; i < arr.length; i++) { //O(N)
				fin[i] = Math.max(fin[i-1], fin[i-2] + arr[i]);
			}
		}

		return fin[fin.length-1];

	}	

}
