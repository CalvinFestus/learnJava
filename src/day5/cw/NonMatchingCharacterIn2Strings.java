package day5.cw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NonMatchingCharacterIn2Strings {

	@Test
	public void example1() {

		String s1 = "amazon";
		String s2 = "india";
		List<String> nonCommonChars = getNonCommonChars(s1,s2);
		System.out.println(nonCommonChars);

	}

	public List<String> getNonCommonChars(String s1,String s2){

		List<String> ans = new ArrayList<String>();
		
		int[] arr = new int[26];
		Arrays.fill(arr, 0);
		int[] arr2 = new int[26];
		Arrays.fill(arr2, 0);
		char[] charS1 = s1.toCharArray();
		char[] charS2 = s2.toCharArray();
		
		for (int i = 0; i < charS1.length; i++) {
			arr[charS1[i]-'a']++;
		}
		
		for (int i = 0; i < charS2.length; i++) {
			arr2[charS2[i]-'a']++;
		}
				
		for(char c = 'a'; c<='z';++c) {
						
			if((arr[c-'a']!=0 && arr2[c-'a']==0) || (arr2[c-'a']!=0 && arr[c-'a']==0)) {
				ans.add(""+c);
			}

		}
		
		return ans;

	}
}