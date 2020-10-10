package day5.cw;

import org.junit.Test;

public class UniqueChar {
	
	@Test
	public void example1() {

		String s1 = "leetcode";
		System.out.println(firstUniqChar(s1));

	}
	
	@Test
	public void example2() {

		String s1 = "loveleetcode";
		System.out.println(firstUniqChar(s1));

	}

	public int firstUniqChar(String s) {
		
		char[] arr = s.toCharArray();
		int[] ind = new int[26];
		for(char c : arr){
			ind[c-'a']++;
		}

		for(int i = 0 ; i<s.length(); i++){

			if(ind[s.charAt(i)-'a']==1){
				return i;
			}

		}
		return -1;
	}

}
