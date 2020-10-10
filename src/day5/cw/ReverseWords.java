package day5.cw;

import org.junit.Test;

public class ReverseWords {
	
	@Test
	public void example1() {
		String s1 = " java book ";
		String output = getReversedString(s1);
		System.out.println(output);
	}
	
	public String getReversedString(String s) {
       
		StringBuilder sb = new StringBuilder();
        
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)==' ') {
				continue;
			}
			
			int start = i;
			
			while(i<s.length() && s.charAt(i) !=  ' ') {
				i++;
			}
			System.out.println(sb);
			if(sb.length() == 0) {
				sb.insert(0,s.substring(start,i));
			}else {
				sb.insert(0," ").insert(0,s.substring(start,i));
			}
			
			
		}
		
		return sb.toString();
    }

}
