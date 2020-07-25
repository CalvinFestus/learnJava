package strings;

import java.util.Scanner;

public class LengthOfLastWord {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String st[] = s.split(" ");
        int n = st.length;
        
        if(s == null || n ==0){
            System.out.println(0);
        }else if(st.length==0){
        	System.out.println(0);
        }else{
            System.out.println(st[n-1].length());
        }
		
	}

}
