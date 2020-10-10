package day2.hw;

import org.junit.Test;

public class Monotnic_Method2 {

	private boolean isMonotonic (int[] numbers) {
		boolean increasing = true;
		boolean decreasing = true;
		
		for (int i = 0; i < numbers.length-1; i++) {
			if(numbers[i]>numbers[i+1]) {
				 increasing = false;
			}
			if(numbers[i]<numbers[i+1]) {
				 decreasing = false;
			}
		}
		
		return increasing || decreasing;
	}


	@Test
	public void example1() {
		int[] numbers = {1,2,3,3,4,4,4,4,5};
		System.out.println("Set 1");
		boolean ans = isMonotonic(numbers);
		System.out.println(ans);
	}

	@Test
	public void example2() {
		int[] numbers = {1,2,5,3,4,4,4,4,5};
		System.out.println("Set 2");
		boolean ans = isMonotonic(numbers);
		System.out.println(ans);
	}

	@Test
	public void example3() {
		int[] numbers = {-5,0,1,2,3,4,5,6};
		System.out.println("Set 3");
		boolean ans = isMonotonic(numbers);
		System.out.println(ans);
	}
	
	@Test
	public void example4() {
		int[] numbers = {-5,-6,0,1,2,3,4,5,6};
		System.out.println("Set 4");
		boolean ans = isMonotonic(numbers);
		System.out.println(ans);
	}
	
	@Test
	public void example5() {
		int[] numbers = {-5,-4,0,1,2,3,4,5,-6};
		System.out.println("Set 5");
		boolean ans = isMonotonic(numbers);
		System.out.println(ans);
	}
	
	@Test
	public void example6() {
		int[] numbers = {0,1,2,3,4,5,-6};
		System.out.println("Set 6");
		boolean ans = isMonotonic(numbers);
		System.out.println(ans);
	}

}
