package learnjava;

import java.util.Scanner;

public class Day1CountO {

	public static void main(String[] args) {
		
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] a = input.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]=='o' || a[i]=='O') {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		sc.close();
		

	}

}
