package ds.arrays;

import org.junit.Test;

public class SmallestMissingPositive {

	private int findSmallPositive (int[] numbers) {
		int j=0;
		for (int i = 0; i < numbers.length; i++) {
			int temp;
			if(numbers[i]<=0) {
				temp = numbers[i];
				numbers[i] =numbers[j];
				numbers[j] = temp;
				j++;
			}
			
		}
		
		int[] numbers1 = new int[numbers.length-j];
		int k=0;
		for (int i = j; i < numbers.length; i++) {
			numbers1[k]=numbers[i];
			k++;
		}
		
		for (int i = 0; i < numbers1.length; i++) {
			
			int x = Math.abs(numbers1[i]);
			
			if(x>0 && x-1 < numbers1.length && numbers1[x-1]>0) {
				numbers1[x-1] = -numbers1[x-1];
			}
			
		}
		
		for (int i = 0; i < numbers1.length; i++) {
			if(numbers1[i]>0) {
				return i+1;
			}
		}
		return numbers1.length+1;
		
	}


	@Test
	public void example1() {
		int[] numbers = {2,8,-10,1,0,-2,1};
		int missing = findSmallPositive(numbers);
		System.out.println(missing);
	}



}
