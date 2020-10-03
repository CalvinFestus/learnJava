package day4.hw;

import java.util.Arrays;

import org.junit.Test;

public class Permutation_BruteForce {
	
	@Test
	public void example1() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(getPermutation(s1,s2));
	}

	private boolean getPermutation(String s1, String s2) { // O(N log N) + O(N) * O(N log N)
		
		char[] char1 = s1.toCharArray();
		Arrays.sort(char1); //O(N log N)
		String sortS1 =Arrays.toString(char1);
		System.out.println(sortS1);
		for (int i = 0; i < s2.length() - s1.length(); i++) { // O(N)
			String subs = s2.substring(i, i+s1.length());
			char[] char2 = subs.toCharArray();
			Arrays.sort(char2); //O(N log N)
			String sortS2 = Arrays.toString(char2);
			System.out.println(sortS2);
			if(sortS1.equals(sortS2)) {
				return true;
			}
		}
		return false;
		
	}
}
