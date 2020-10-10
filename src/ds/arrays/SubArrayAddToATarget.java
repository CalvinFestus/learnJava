package ds.arrays;

import org.junit.Test;

public class SubArrayAddToATarget {

	private void getsubArray (int[] numbers, int target) {
		int starting_index = 0,ending_index = 0;
		int max=0;
		int array_start = 0,array_end = 0;
		for (int i = 0; i < numbers.length; i++) {
			starting_index = i;
			System.out.println("starting_index : "+starting_index);
			int sum= numbers[i];
			for (int j = i+1; j < numbers.length; j++) {
				if(sum==target) {
					ending_index = j-1;
					System.out.println("ending_index : "+ending_index);
					break;
				}else if (sum>target) {
					break;
				}
				sum = sum + numbers[j];
				
			}
			int diff = ending_index-starting_index;
			
			if(diff>max) {
				array_start = starting_index;
				array_end = ending_index;
				max = diff;
				System.out.println(array_start);
				System.out.println(array_end);	
			}
			
		}
		
		System.out.println(array_start);
		System.out.println(array_end);		
	}


	@Test
	public void example1() {
		int[] numbers = {1,7,4,3,1,2,1,5,1};
		int target = 7;
		getsubArray(numbers,target);
	}

	/*
	 * @Test public void example2() { int[] numbers = {1,2,4,5}; int target = 7;
	 * getsubArray(numbers,target); }
	 */


}
