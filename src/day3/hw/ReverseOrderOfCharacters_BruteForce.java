package day3.hw;

import org.junit.Test;

public class ReverseOrderOfCharacters_BruteForce {
	
	@Test
	public void example1() {
		String input = "I am doing great";
		String output = getReverseOrder(input);
		System.out.println(output);
	}
	
	private String getReverseOrder(String input) {
		
		String[] split = input.split("\\s");
		
		String output = "";
		
		for (int i = 0; i < split.length; i++) {
			
			char[] splitArr = split[i].toCharArray();
			
			String sp = "";
			
			for (int j = splitArr.length-1; j>=0; j--) {
				sp = sp + splitArr[j];
			}
			
			output = output + sp+ " ";
			
		}
		
		return output.trim();
	}

}
