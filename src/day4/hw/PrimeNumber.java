package day4.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class PrimeNumber {
	
	Set<Integer> primeNum = new HashSet<Integer>();
	
	@Test
	public void example1() {
		
		String numbers = "403198305";
		char[] chararr = numbers.toCharArray();
		getAllPrime(chararr);
		
		
	}
	
	
	
	private void getAllPrime(char[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			int prod = Integer.parseInt(String.valueOf(nums[i]));
			isPrime(prod);
			if(prod!=0) {
				for (int j = i+1; j < nums.length; j++) {
					prod = prod * 10 + nums[j];
					isPrime(prod);
				}
			}
			
		}
		System.out.println(primeNum);
	}
	
	private void isPrime(int num){
		
		boolean flag =false;
		
		if(num==0 || num==1) {
			primeNum.add(num);
		}

		for (int i = 2; i < num/2; i++) {
			if(num%i==0) {
				flag =true;
				break;
			}
		}
		if(!flag) {
			primeNum.add(num);
		}
	}

}
