package day3.cw;

import java.util.Arrays;

import org.junit.Test;

public class Anagram {

	private int anagramOfString(String input,String ana) {
		int count= 0;
		int endIndex = ana.length();
		char[] anaArr = ana.toCharArray();
		for (int i = 0; i < input.length()-3 ; i++) {
			String subs = input.substring(i, i+endIndex);	
			System.out.println(subs);
			char[] subsArr = subs.toCharArray();
			Arrays.sort(subsArr);
			if(anaArr.equals(subsArr)) {
				count++;
			}
		}

		return count;		
	}
	
	//String input="acbbabccaabcab";
    //String anagram="abc";

	@Test
	public void example1() {
		String input  = "abcdacdabcd";
		String ana  = "abc";
		System.out.println("Set 1");
		int occ = anagramOfString(input,ana);
		System.out.println(occ);
	}

	@Test
	public void example2() {
		String input  = "acbbabccaabcab";
		String ana  = "abc";
		System.out.println("Set 2");
		int occ = anagramOfString(input,ana);
		System.out.println(occ);
	}
}
