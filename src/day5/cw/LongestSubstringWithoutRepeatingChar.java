package day5.cw;

import java.util.HashSet;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingChar {
	
	@Test
	public void example1() {

		String s1 = "pwwkew";
		int longSubs = getLongestSubstring(s1);
		System.out.println(longSubs);

	}
	
	private int getLongestSubstring(String s) {
		
		char[] charArr = s.toCharArray();
		
		HashSet<Character> set = new HashSet<Character>();
		int max = 0;
		
		for (int i = 0; i < charArr.length; i++) {
			
			if(set.contains(charArr[i])) {
				max = set.size();
			}else {
				set.add(charArr[i]);
			}
		}
		
		System.out.println(set);
		
		return max;
	}

}
