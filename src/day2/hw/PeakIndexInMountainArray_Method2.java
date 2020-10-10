package day2.hw;

import org.junit.Test;

public class PeakIndexInMountainArray_Method2 {
	
	public int peakIndexInMountainArray(int[] A) {
        int low = 0;
        int high = A.length - 1;
        
        while(low < high){
            int mid = (low + high) / 2;
            if(A[mid] > A[mid-1] && A[mid] > A[mid+1]){ return mid; }
            if(A[mid-1] < A[mid] && A[mid] < A[mid+1]){ low = mid + 1; }
            else{ high = mid - 1; }
        }
        return low;
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
