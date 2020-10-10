package day5.cw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindCommonCharateristics_Method2 {
	
	@Test
	public void example1() {
		
		String [] arr = {"label","bella","roller"};
		List<String> commonChars = getCommonChars(arr);
		System.out.println(commonChars);
		
	}
	
	public List<String> getCommonChars(String[] arr){
		
		List<String> ans = new ArrayList<String>();
		
		int[] count = new int[26];
		Arrays.fill(count,Integer.MAX_VALUE);
		
		for (String str : arr) {
			
			System.out.println("for loop Stig");
			
			int[] cnt = new int[26];
			
			char[] charArr = str.toCharArray();
			
			for (char c : charArr) {
				cnt[c-'a']++;
			}
			
			for (int i = 0; i < 26; i++) {
				count[i] = Math.min(count[i], cnt[i]);
			}
			
		}
		
		System.out.println(Arrays.toString(count));
	
		for(char c = 'a'; c<='z';++c) {
			while(count[c-'a']>0) {
				ans.add(""+c);
				count[c-'a']--;
			}
		}
		
		return ans;
	}

}
