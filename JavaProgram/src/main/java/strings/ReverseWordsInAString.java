package strings;

import java.util.Scanner;

public class ReverseWordsInAString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		
		String[] split = s.split("[\\s]");
		String a[] = new String[split.length];
		int j=0;
		for (int i = split.length-1; i >=0; i--) {
			
			if(split[i].matches("[\\S]+")) {
				System.out.println(split[i]);
				a[j]=split[i];
				j++;
			}			
		
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=null) {
				sb.append(a[i]);
				sb.append(" ");
			}
		}
		System.out.println(sb.substring(0, sb.length()-1).toString());
	}

}
