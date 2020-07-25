package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		Set<Character> vowels = new HashSet<Character>();
		vowels.add('A');
		vowels.add('a');
		vowels.add('E');
		vowels.add('e');
		vowels.add('I');
		vowels.add('i');
		vowels.add('O');
		vowels.add('o');
		vowels.add('U');
		vowels.add('u');

		char[] characters = s.toCharArray();
		int i=0;
		int j= characters.length-1;

		while(i<j) {

			while(i<j && !vowels.contains(characters[i])) {

				i++;
			}

			while(i<j && !vowels.contains(characters[j])) {

				j--;
			}

			char temp = characters[i];

			characters[i] = characters[j];
			i++;

			characters[j] = temp;
			j--;




		}

		System.out.println(new String(characters));

	}

}
