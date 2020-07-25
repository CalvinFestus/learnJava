package strings;

import java.util.Scanner;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s.substring(0,0));
		int max=0,start=0, end=0;
		
		if(s.length()==1) {
			System.out.println(s);
		}else if(s == null || s.length() ==0){
			System.out.println("");
		}else {
			for(int i=0;i<s.length();i++){
	            for(int j=i+1;j<=s.length();j++){
	                
	                String org = s.substring(i,j);
	                String rev = "";
	                
	                for(int k=org.length()-1;k>=0;k--){
	                    rev = rev + org.charAt(k);
	                    
	                }
	                System.out.println(org + " " + rev);
	                if(org.equals(rev) && org.length()>max){
	                    max = org.length();
	                    start = i;
	                    end = j;
	                }
	            }
	        }
			System.out.println(s.substring(start,end));
			
		}
        
        
  
        
		
	}

}
