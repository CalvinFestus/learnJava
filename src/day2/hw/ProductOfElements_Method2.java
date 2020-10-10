package day2.hw;

import java.util.Arrays;

import org.junit.Test;

public class ProductOfElements_Method2 {

	private int[] getProduct (int[] numbers) {

		int[] prodArr = new int[numbers.length];
		int[] left = new int[numbers.length];
		int[] right = new int[numbers.length];
		
		left[0]= 1;
		right[numbers.length-1]=1;
		
		for (int i = 1; i < numbers.length; i++) {
			left[i] = numbers[i-1] * left [i-1];
		}
		
		for (int j = numbers.length-2; j >=0; j--) {
			right[j] = numbers[j+1] * right [j+1];
		}
		
		for (int i = 0; i < numbers.length; i++) {
			prodArr[i] = left[i] * right [i];
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
