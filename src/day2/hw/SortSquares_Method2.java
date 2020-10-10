package day2.hw;

import java.util.Arrays;

import org.junit.Test;

public class SortSquares_Method2 {
	
	private int[] getSortSquares (int[] numbers) {
		
		int[] result = new int[numbers.length]; 
		int i=0,j=0,s=0;
		
		for (int k = 0; k < numbers.length; k++) {
			if(numbers[k]<0) {
				j++;
			}
			numbers[k] = numbers[k] * numbers[k];
		}
		i = j-1; // -8,-3,3,4,10 Arrays.setAll(input, i->input[i]*input[i]);
		
		while(i>=0 && j<=numbers.length-1) {
			
			if(numbers[i]<numbers[j]) {
				result[s] = numbers[i];
				i--;
			}else {
				result[s] = numbers[j];
				j++;
			}
			s++;
		}
		
		while(i>=0) {
			result[s] = numbers[i];
			i--;
			s++;
		}
		
		while(j<=numbers.length-1) {
			result[s] = numbers[j];
			j++;
			s++;
		}
		
		
		return result;
		
	}


	@Test
	public void example1() {
		int[] numbers = {-8,-3,3,4,10}; 
		System.out.println("Set 1");
		int[] squareArray = getSortSquares(numbers);
		System.out.println(Arrays.toString(squareArray));
	}

	@Test
	public void example2() {
		int[] numbers = {-5,-4,-3,-2,-1};
		System.out.println("Set 2");
		int[] squareArray = getSortSquares(numbers);
		System.out.println(Arrays.toString(squareArray));
	}


}
