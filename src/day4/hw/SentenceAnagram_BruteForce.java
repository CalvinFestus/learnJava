package day4.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SentenceAnagram_BruteForce {

	@Test
	public void example1() {
		String s1 = "stale are there in tesla and you can steal the pears";
		List<String> ana = getAnagrams(s1);
		System.out.println(ana);
	}

	@Test
	public void example2() {
		String s1 = "please listen and be silent";
		List<String> ana = getAnagrams(s1);
		System.out.println(ana);
	}

	@Test
	public void example3() {
		String s1 = "Hello I am Fine";
		List<String> ana = getAnagrams(s1);
		System.out.println(ana);
	}
	
	/*
	 * Spilit the Array into String Array. Make each String into char array and sort it
	 * Then Iterate the String array and comapre both strings are equal
	 * 
	 * O(N^2)
	 * 
	 */

	private List<String> getAnagrams(String s1) { 
		ArrayList<String> arr = new ArrayList<String>();

		String[] splitArr = s1.split(" ");

		for (int i = 0; i < splitArr.length; i++) {
			String firstString = sort(splitArr[i]);
			for (int j = i+1; j < splitArr.length; j++) {
				
				String compareString = sort(splitArr[j]);

				if(firstString.equals(compareString)) {

					if(!arr.contains(splitArr[i])) {
						arr.add(splitArr[i]);
					}
					if(!arr.contains(splitArr[j])) {
						arr.add(splitArr[j]);
					}

				}
			}
		}

		return arr;
	}

	private String sort(String ss) {

		char[] charArr = ss.toCharArray();
		Arrays.sort(charArr);		
		return Arrays.toString(charArr);

	}

}
