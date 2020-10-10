package day5.cw;

import java.util.HashSet;

import org.junit.Test;

public class LongestPalindromicSubstring_BruteForce {

	@Test
	public void example1() {

		String s1 = "geeksskeeg";
		String longSubs = getLongestPalindromicSubstring(s1);
		System.out.println(longSubs);

	}
	
	@Test
	public void example2() {

		String s1 = "pwwkew";
		String longSubs = getLongestPalindromicSubstring(s1);
		System.out.println(longSubs);

	}
	
	@Test
	public void example3() {

		String s1 = "pwww";
		String longSubs = getLongestPalindromicSubstring(s1);
		System.out.println(longSubs);

	}
	
	@Test
	public void example4() {

		String s1 = "forgeeksskeegfor";
		String longSubs = getLongestPalindromicSubstring(s1);
		System.out.println(longSubs);

	}


	private String getLongestPalindromicSubstring(String s) {
		int max = 1 , start =0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				
				int flag = 1;
				
				for (int k = 0; k <(j-i+1)/2; k++) {
					if(s.charAt(i+k)!=s.charAt(j-k)) {
						flag = 0;
					}
				}
				if(flag==1 && (j-i+1)>max) {
					start = i;
					max = j-i+1;
				}
			}
		}
		
		System.out.println(max);
		
		if(max == s.length()) {
			return s.substring(start, max);
		}else {
			return s.substring(start, max+1);
		}
			
		

	}
}