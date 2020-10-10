package day4.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SentenceAnagram_Method2 {
	
	@Test
	public void example1() {
		String s1 = "stale are there in tesla and you can steal the pears";
		List<List<String>> l1 = getAnagrams(s1.split(" "));
		System.out.println(l1);
	}

	@Test
	public void example2() {
		String s1 = "please listen and be silent";
		List<List<String>> l1 = getAnagrams(s1.split(" "));
		System.out.println(l1);
	}

	@Test
	public void example3() {
		String s1 = "Hello I am Fine";
		List<List<String>> l1 = getAnagrams(s1.split(" "));
		System.out.println(l1);
	}
	
	/*
	 * 
	 */

	public List<List<String>> getAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) {
            	ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

}
