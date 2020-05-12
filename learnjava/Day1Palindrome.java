package learnjava;

import java.util.Scanner;

public class Day1Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		
		/*StringBuilder sb = new StringBuilder(input);
		
		String revString = sb.reverse().toString();*/
		
		//method 2
		char[] inpArr = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i=inpArr.length-1;i>=0;i--) {
			sb.append(inpArr[i]);
		
		}
		String revString = sb.toString();
		
		if(input.equalsIgnoreCase(revString)) {
			
			System.out.println("Yes, Palindrome : "+ revString);
		}
		else {
			System.out.println("No, not a palindrome : " + revString);
		}
		

		
		
	}

}
