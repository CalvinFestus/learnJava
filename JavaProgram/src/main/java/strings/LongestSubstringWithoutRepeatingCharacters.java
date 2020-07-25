	package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		Map<Character, Integer> mp  = new HashMap<Character, Integer>();
		int max = 0, length, flag = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(mp.containsKey(c) && mp.get(c)>=flag) {
				
				length = i - flag;
					
				if(length>flag) {
					max = length;
					
				}
				
				flag = mp.get(c) + 1;
				
			
			}
			
			mp.put(c, i);
			
		}
		
		if(s.length()-flag > max) {
			max = s.length()-flag;
		}
		
		System.out.println(max);
		
	}

}
