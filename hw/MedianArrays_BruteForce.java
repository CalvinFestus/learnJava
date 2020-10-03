package day4.hw;

import org.junit.Test;

public class MedianArrays_BruteForce {
	
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
	 * Sort the Array and FInd the Mid Value in case of Odd Arr else avg of mid 2 nums of even arr
	 * 
	 * O(N) + O(N) + O(N) + O(1)
	 */

	private double getMedianOfArrays(int[] arr1, int[] arr2) {
		
		int[] res = new int[arr1.length + arr2.length];
        
        int i=0;
        int j=0;
        int k=0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            }
            else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        for (; i<arr1.length; i++) {
            res[k] = arr1[i];
            k++;
        }
                
        for (; j<arr2.length; j++) {
            res[k] = arr2[j];
            k++;
        }
        
        int l = res.length;
        
        if (l % 2 != 0) {
            return res[l/2];
        }

        //else
        return (double)(res[(l-1)/2] + res[(l)/2]) / 2;
		
	}	

}
