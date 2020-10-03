package day4.hw;

import org.junit.Test;

public class PalindromicStrings_Method2 {
	
	@Test
	public void example1() {
		String input = "aaa";
		int noOfPalindromes = getAllPalindromes(input);
		System.out.println("Set 1:" +noOfPalindromes);
		
	}
	
	@Test
	public void example2() {
		String input = "aabc";
		int noOfPalindromes = getAllPalindromes(input);
		System.out.println("Set 2:" +noOfPalindromes);
		
	}
	
	/*
	 * Decompose the String into all possible Strings and Check if its palindrome
	 * 
	 * O(N^2)
	 */

	private int getAllPalindromes(String S) {
		
		int N = S.length(), ans = 0;
        for (int center = 0; center <= 2*N-1; center++) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
		
	}	

}
