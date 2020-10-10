package day3.cw;

import org.junit.Test;

public class GetUniqueCharacters {
	
	@Test
	public void example1() {
		String input="Testleaf";
		findUnique(input.toLowerCase());
		
	}
	
	private void findUnique(String input) {
		
		for (int i = 0; i < input.length(); i++) {
			if(input.lastIndexOf(input.charAt(i))==i && input.indexOf(input.charAt(i))==i)
				System.out.print(input.charAt(i));
		}
		
		
	}

}
