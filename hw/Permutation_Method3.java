package day4.hw;

import org.junit.Test;

public class Permutation_Method3 {
	
	@Test
	public void example1() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(getPermutation(s1,s2));
	}
	
	/*
	 * Create a Array with Length 26 chars and Increment value for alphabets at index. For 'a' it is 0 and for 'z' it is 25
	 * for s1 length add chars in arr1 and arr2
	 * Then slide through one after other in s2
	 * 
	 * O(N) + O(N) * O(M)
	 */

	private boolean getPermutation(String s1, String s2) { 
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		for (int i = 0; i < s1.length(); i++) {
			arr1[s1.charAt(i)-'a']++;
			arr2[s2.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < s2.length()-s1.length(); i++) {
			if(matches(arr1,arr2)) {
				return true;
			}
			arr2[s2.charAt(i+s1.length())-'a']++;
			arr2[s2.charAt(i)-'a']--;
			
		}
		
		return matches(arr1,arr2);
		
	}
	
	public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }

}
