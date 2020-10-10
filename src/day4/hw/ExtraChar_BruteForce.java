package day4.hw;

import org.junit.Test;

public class ExtraChar_BruteForce {
	
	@Test
	public void example1() {
		String s1 = "Test";
		String s2 = "Test$";
		System.out.println(getExtraChar(s1,s2));
	}
	
	@Test
	public void example2() {
		String s1 = "Hello";
		String s2 = "lloreH";
		System.out.println(getExtraChar(s1,s2));
	}
	
	/*
	 * Iterate both the Strings and try find if any matching values are found
	 * If matching values are found add counter. If Counter is still Zero, it is a Extra Char
	 * 
	 *  O(N^2)
	 */

	private char getExtraChar(String s1, String s2) { //Test
		
		for (int i = 0; i < s2.length(); i++) { //Test$
			int count=0;
			for (int j = 0; j < s1.length(); j++) {
				if(s2.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}
			if(count==0) {
				return s2.charAt(i);
			}
		}
		
		return 0;
		
	}

}
