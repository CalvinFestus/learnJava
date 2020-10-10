package day4.hw;

import java.util.Arrays;
import org.junit.Test;

public class WeekestRowsInAMatrix {
	
	@Test
	public void example1() {

		int arr[][] = { {1,1,0,0,0}, 
						{1,1,1,1,0}, 
						{1,0,0,0,0},
						{1,1,0,0,0},
						{1,1,1,1,1}
					}; 
		int k = 3;
					
		int[] kWeakestRows = kWeakestRows(arr,k);
		System.out.println(Arrays.toString(kWeakestRows));

	}

	public int[] kWeakestRows(int[][] mat, int k) {
		
        int[] a = new int[k];
        int[] b = new int[mat.length];
        int[] c = new int[mat.length];

        for(int i=0; i<mat.length;i++){
            int sum=0;
            for(int j=0; j<mat[i].length; j++){
                sum += mat[i][j];
            }
            b[i] = sum;
            c[i] = i;
        }
		
        for (int i = 0; i < b.length-1; i++) {
            for (int j = i+1; j < b.length; j++) {
                if(b[i] > b[j] || c[i] > c[j]){
                    int t = b[i];
                    b[i] = b[j];
                    b[j] = t;

                    t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }

            }
        }
        
        for (int i = 0; i < k; i++) {
            a[i] = c[i];
        }

        return a;
		
	}

}
