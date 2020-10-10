package day2.hw;

import org.junit.Test;

public class LuckyInteger_BruteForce {
	
	private int getLuckyInt (int[] numbers) {
		int max=-1;
		for (int i = 0; i < numbers.length; i++) {
			int count=0;
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[i]==numbers[j])	{
					count++;
				}
			}
			
			if(numbers[i]==count && count>max) {
				max=count;
			}
			
		}
		
		return max;
		
	}


	@Test
	public void example1() {
		int[] numbers = {1,2,3,3,4,4,4,4,5}; 
		System.out.println("Set 1");
		int luckyInt = getLuckyInt(numbers);
		System.out.println(luckyInt);
	}

	@Test
	public void example2() {
		int[] numbers = {2,3,3,4,4,4,5};
		System.out.println("Set 2");
		int luckyInt = getLuckyInt(numbers);
		System.out.println(luckyInt);
	}


}
