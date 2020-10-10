package day2.hw;

import java.util.HashMap;

import org.junit.Test;

public class LuckyInteger_Method2 {
	
	private int getLuckyInt (int[] numbers) {
		int max=-1;
		HashMap<Integer, Integer> map = new HashMap <Integer,Integer>();
		
		for (int i : numbers) {  //O(N)
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for (int i : numbers) { //O(N)
			if(i==map.get(i)) { 
				max = Math.max(max, i);
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
