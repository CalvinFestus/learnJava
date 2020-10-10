package day5.cw;

import java.util.Arrays;

import org.junit.Test;

public class RepeatedStringMatch {

	@Test
	public void example1() {

		String s1 = "abcd";
		String s2 = "cdabcdab";
		System.out.println(getRepeatedStringCount(s1,s2));

	}

	private int getRepeatedStringCount(String s1, String s2) {

		
		int copies =0;
		StringBuilder sb = new StringBuilder();
		
		while(sb.length() < s2.length()) {
			sb.append(s1);
			copies++;
		}
		System.out.println(sb.indexOf(s2));
		if(sb.indexOf(s2)>=0) {
			return copies++;
		}
		
		sb.append(s1);
		copies++;
		if(sb.indexOf(s2)>=0) {
			return copies++;
		}
		
		return -1;
	}
}
