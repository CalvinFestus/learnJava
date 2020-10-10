package ds.arrays;

import java.util.HashMap;

import org.junit.Test;

public class SubArrayAddToATarget_Method2 {
	
	private void getsubArray (int[] numbers, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum_so_far = 0;
		map.put(0,-1);
		for (int i = 0; i < numbers.length; i++) {
			sum_so_far += numbers[i];
			int diff = sum_so_far - target;
			if(map.containsKey(diff)) {
				System.out.println("SubArray: {"+ (map.get(diff)+1) + " , " + i + "}");
			}
			map.put(sum_so_far,i);
			
		}
		
	}


	@Test
	public void example1() {
		int[] numbers = {1,7,4,3,1,2,1,5,1};
		int target = 7;
		getsubArray(numbers,target);
	}

}
