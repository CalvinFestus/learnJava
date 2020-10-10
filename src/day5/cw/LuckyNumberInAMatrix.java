package day5.cw;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LuckyNumberInAMatrix {
	
	@Test
	public void example1() {

		int arr[][] = { { 3,   7,  8 }, 
						{ 9,  11, 13 }, 
						{ 15, 16, 17 } }; 
		List<Integer> luckyNum = luckyNumbers(arr);
		System.out.println(luckyNum);

	}

	public List<Integer> luckyNumbers (int[][] matrix) {
		
		List<Integer> lst = new ArrayList<Integer>();
		int min,max;
		int col_num = 0;
		for (int i = 0; i < matrix.length; i++) {
			min = Integer.MAX_VALUE;
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j]<min) {
					min = matrix[i][j];
					System.out.println("Min " + min);
					col_num = j;
				}
			}
			max = 0;
			for (int k = 0; k < matrix.length; k++) {
				if(matrix[k][col_num]>max) {
					max = matrix[k][col_num];
					System.out.println("Max "+max);
				}
			}
			if(min==max) {
				lst.add(min);
			}
		}
		
		return lst;
		
	}

}
