package strings;

import java.util.Scanner;

public class NumberOfSubstringsWith1s {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int result =0,count =0, mod = 1000000007;
		
		for(int i=0;i<s.length();i++) {
			
			count = s.charAt(i)=='1' ? count + 1 : 0;  
			
			/*if(s.charAt(i)=='1') {
				count = count + 1;
			}else {
				count = 0;
			}*/
			
			result = (result + count)%mod;
			
		}
		System.out.println(result);
		
	}

}
