package day4.hw;

import java.util.Arrays;

import org.junit.Test;

public class ExtraChar_Method3 {

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
	 * Create a arr with 256 chars. Add the value in ASCII Match. For 'A' increment add 1 in a[65] for String 2
	 * Then for String 1, do the same and if the values are 1 ,then that is the Extra Char
	 * O(N) + O(N) + O(N)   
	 */

	private void getExtraChar(String s1, String s2) { 
		int[] arr = new int[256];
		Arrays.fill(arr, 0);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < s2.length(); i++) {  //Test$
			arr[s2.charAt(i)]++;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i)]--;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {
				System.out.println((char)i);
			}
		}
	}

}
