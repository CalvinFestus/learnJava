package day4.hw;

import org.junit.Test;

public class PalindromicStrings_BruteForce {
	
	@Test
	public void example1() {
		String input = "aaa";
		int noOfPalindromes = getAllPalindromes(input);
		System.out.println(noOfPalindromes);
		
	}
	
	@Test
	public void example2() {
		String input = "aabc";
		int noOfPalindromes = getAllPalindromes(input);
		System.out.println(noOfPalindromes);
		
	}
	
	/*
	 * Find all possible Strings and reverse it and check whether it is a Palindrome
	 * 
	 * O(N^2)
	 */

	private int getAllPalindromes(String input) {
		
		int count =0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				String s1 = input.substring(i, j+1);
				
				StringBuilder sb = new StringBuilder(s1);
				
				String s2 = sb.reverse().toString();
				
				if(s1.equals(s2)) {
					count++;
				}
				// System.out.println(s1 + "  " + s2);
			}
		}
		return count;
	}
	
	

}
