package day5.cw;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ReverseVowels_TwoPOinters {
	
	/*
	 * @Test public void example1() { String input = "babu"; String revVow =
	 * reverseAllTheVowels(input); System.out.println(revVow); }
	 */
	
	@Test
	public void example2() {
		String input = "deepan";
		String revVow = reverseAllTheVowels(input);
		System.out.println(revVow);
	}
	
	private String reverseAllTheVowels(String s) {
		
		int i = 0;
		int j = s.length()-1;
		
		char[] arr = s.toCharArray();
		
		ArrayList<Character> arrList = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
		
		while(i<j) {
			
			if(arrList.contains(arr[i]) && arrList.contains(arr[j])){
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			
			}else if (arrList.contains(arr[i])) {
				j--;
			}else if (arrList.contains(arr[j])){
				i++;
			}else {
				i++;
				j--;
			}
			
		}
		
		return String.valueOf(arr);

	}

}
