package day4.hw;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class ExtraChar_Method2 {

	@Test
	public void example1() {
		String s1 = "Test";
		String s2 = "Test$";
		getExtraChar(s1,s2);
	}

	@Test
	public void example2() {
		String s1 = "Hello";
		String s2 = "lloreH";
		getExtraChar(s1,s2);
	}
	
	@Test
	public void example3() {
		String s1 = "Hello";
		String s2 = "lloleH";
		getExtraChar(s1,s2);
	}

	/*
	 * Put each char of s2 in a map
	 * Remove each char of s1 in same map
	 * The remaining char will be the extra char
	 * 
	 * O(N) + O(N) = O(2N) = O(N)
	 */
	private void getExtraChar(String s1, String s2) { 

		HashMap<Character, Integer> mp1 = new HashMap<Character, Integer>();

		for (int i = 0; i < s2.length(); i++) { //O(N)
			mp1.put(s2.charAt(i), mp1.getOrDefault(s2.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < s1.length(); i++) { //O(N)
			if(mp1.get(s1.charAt(i)) == 1) {
				mp1.remove(s1.charAt(i));
			}else {
				mp1.put(s1.charAt(i), mp1.getOrDefault(s1.charAt(i), 0)-1);
			}
		}
		
		
		for (Entry<Character, Integer> e : mp1.entrySet()) {
			System.out.println(e.getKey());
		}
		

	}

}
// https://www.geeksforgeeks.org/find-one-extra-character-string/