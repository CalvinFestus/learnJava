package day2.hw;

import java.util.Arrays;
import org.junit.Test;

public class ProductOfElements_BruteForce {

	private int[] getProduct (int[] numbers) {
		
		int[] prodArr =new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			int prod = 1 ;
			for (int j = 0; j < numbers.length; j++) {				
				if(i!=j) {
					prod =prod * numbers[j];
				}				
			}
			prodArr[i] = prod;
		}
		return prodArr;

	}


	@Test
	public void example1() {
		int[] numbers = {1,2,3,4}; 
		System.out.println("Set 1");
		int[] prodArr = getProduct(numbers);
		System.out.println(Arrays.toString(prodArr));
	}

	@Test
	public void example2() {
		int[] numbers = {1,2,3,4,5,6,7};
		System.out.println("Set 2");
		int[] prodArr = getProduct(numbers);
		System.out.println(Arrays.toString(prodArr));
	}

}
