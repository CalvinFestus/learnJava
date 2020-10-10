package day4.hw;

import org.junit.Test;

public class MedianArrays_Method2 {
	
	@Test
	public void example1() {
		int[] arr1 = {1,3};
		int[] arr2 = {2};
		double medianValue = getMedianOfArrays(arr1,arr2);
		System.out.println("Set 1:" +medianValue);
		
	}
	
	@Test
	public void example2() {
		int[] arr1 = {1,3};
		int[] arr2 = {2,4};
		double medianValue = getMedianOfArrays(arr1,arr2);
		System.out.println("Set 2:" +medianValue);
		
	}
	
	/*
	 * Create a partition in both arrays at a value and check if maximum value to left partition of Array 1 is less than
	 * or equal to Minimum Value of Right Partition of Array 2
	 * 
	 * Minimum Value of Right Partition of Array 1 should be greater than maximum value to left partition of Array 2
	 * 
	 * O(N) * O(1)
	 */

	private double getMedianOfArrays(int[] arr1, int[] arr2) {
		
		int x = arr1.length;
		int y = arr2.length;
		int low = 0;
		int high = x;
		
		while(low<=high) {
			
			int partitionX = (low+high)/2;
			int partitionY = (x+y+1)/2 - partitionX;
			
			int maxLeftX = (partitionX==0) ? Integer.MIN_VALUE : arr1[partitionX-1];
			int minRightX = (partitionX==x) ? Integer.MAX_VALUE : arr1[partitionX];
			
			int maxLeftY = (partitionY==0) ? Integer.MIN_VALUE : arr1[partitionY-1];
			int minRightY = (partitionY==y) ? Integer.MAX_VALUE : arr1[partitionY];
			
			if(maxLeftX<=minRightY && maxLeftY<=minRightX) {
				 if ((x + y) % 2 == 0) {
	                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
	                } else {
	                    return (double)Math.max(maxLeftX, maxLeftY);
	                }
			}
			else if (maxLeftX > minRightY) { 
                high = partitionX - 1;
            } else { 
                low = partitionX + 1;
            }
			
		}
		return 0;
		
	}	

}
