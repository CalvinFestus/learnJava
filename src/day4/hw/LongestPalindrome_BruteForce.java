package day4.hw;

import org.junit.Test;

public class LongestPalindrome_BruteForce {
	
	@Test
	public void example1() {
		String s1 = "babad";
		System.out.println(longestPalindrome(s1));
	}
	
	@Test
	public void example2() {
		String s1 = "cbbd";
		System.out.println(longestPalindrome(s1));
	}
	
	public String longestPalindrome(String s) {
		
        int max=0,start=0, end=0;
        
        if(s.length()==1) {
			return s;
		}else if(s == null || s.length() ==0){
			return "";
		}else{
            for(int i=0;i<s.length();i++){
	            for(int j=i+1;j<=s.length();j++){
	                
	                String org = s.substring(i,j);
	                String rev = "";
	                
	                for(int k=org.length()-1;k>=0;k--){
	                    rev = rev + org.charAt(k);
	                    
	                }
	                
	                if(org.equals(rev) && org.length()>max){
	                    max = org.length();
	                    start = i;
	                    end = j;
	                }
	            }
	        }
			return s.substring(start,end);
            
        }
    }

}
