package day2.hw;

import org.junit.Test;

public class PeakIndexInMountainArray_BruteForce {
	
	public int peakIndexInMountainArray(int[] A) {
		int i = 0;
		
        while(A[i] < A[i+1]){ 
        	i++; 
        }
        return i;
    
    }
	
	@Test
	public void example1() {
		int[] numbers = {1, 3, 20, 4, 1, 0 }; 
		System.out.println("Set 1");
		int prodArr = peakIndexInMountainArray(numbers);
		System.out.println(prodArr);
	}

	@Test
	public void example2() {
		int[] numbers = {5,6,1,2};
		System.out.println("Set 2");
		int prodArr = peakIndexInMountainArray(numbers);
		System.out.println(prodArr);
	}
	
	@Test
	public void example3() {
		int[] numbers = {0,10,5,2};
		System.out.println("Set 3");
		int prodArr = peakIndexInMountainArray(numbers);
		System.out.println(prodArr);
	}

}
