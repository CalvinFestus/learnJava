package day5.cw;

import org.junit.Test;

public class RepeatedSubstringPattern {

	@Test
	public void example1() {

		String s1 = "abab";
		System.out.println(findRepeatedSubstringPattern(s1));

	}

	@Test
	public void example2() {

		String s1 = "abcabcabcabc";
		System.out.println(findRepeatedSubstringPattern(s1));

	}

	@Test
	public void example3() {

		String s1 = "aba";
		System.out.println(findRepeatedSubstringPattern(s1));

	}
	
	@Test
	public void example4() {

		String s1 = "abababababab";
		System.out.println(findRepeatedSubstringPattern_Method2(s1));

	}
	private boolean findRepeatedSubstringPattern(String s) {

		int len =s.length()/2;

		String sub1 = s.substring(0, len);
		String sub2 = s.substring(len);
		System.out.println(sub1 + " " + sub2);

		if(sub1.equals(sub2)) {
			return true;
		}

		return false;
	}

	private boolean findRepeatedSubstringPattern_Method2(String s) {
		
		int len = s.length();
		
		for (int i = len/2; i>=1; i--) {
			
			int num_repeats =len/i;
			String subs = s.substring(0, i);
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < num_repeats; j++) {
				sb.append(subs);
			}
			if(sb.toString().equals(s)) {
				return true;
			}
		}

		return false;
	}
}
