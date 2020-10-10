package day4.hw;

import org.junit.Test;

public class Permutation_Method2 {
	
	@Test
	public void example1() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(getPermutation(s1,s2));
	}
	
	/*
	 * Create a Array with Length 26 chars and Increment value for alphabets at index. For 'a' it is 0 and for 'z' it is 25
	 * 
	 * Do it for both strings and compareif both arrays are equal
	 * 
	 * O(N)+O(N^2)
	 */

	private boolean getPermutation(String s1, String s2) { 
		
		int[] arr1 = new int[26];
		
		
		for (int i = 0; i < s1.length(); i++) { //ab
			int ind = s1.charAt(i)-'a';
			arr1[ind] = arr1[ind] + 1;
		}
		
		for (int i = 0; i < s2.length()-s1.length(); i++) {			
			int[] arr2 = new int[26];
			for (int j = 0; j < s1.length(); j++) { //eidbaooo
				int inx = s2.charAt(i+j)-'a';
				arr2[inx] = arr2[inx]+1;
			}
			if(matches(arr1,arr2)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }

}
// https://leetcode.com/problems/permutation-in-string/solution/