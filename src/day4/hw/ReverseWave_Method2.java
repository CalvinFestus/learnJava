package day4.hw;

import org.junit.Test;

public class ReverseWave_Method2 {
	
private void getReverseWave(int[][] arr) {
	
	int m = arr.length;
	
	int n = arr[0].length;
		
	int i, j = n - 1, iteration = 1; 
	
	/*
	 * For 1st iteration start from 0 to end and make iteration as 0
	 * Then move from end to 0 and make iteration as 1
	 * O(N^2)
	 */
    
    while (j >= 0)  
    { 
        if (iteration == 1)  
        { 
            for (i = 0; i < m; i++)  
                System.out.print(arr[i][j] +" ");  
          
            iteration = 0; 
            j--; 
        } 
        else {  
            for (i = m - 1; i >= 0; i--)  
                System.out.print( arr[i][j] + " "); 
              
            iteration = 1; 
            j--; 
        } 
    } 

	} 




	@Test
	public void example1() {

		int arr[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } }; 

		getReverseWave(arr); 

	}

}
