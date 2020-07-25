package arrays;

import java.util.Scanner;

public class UniquePaths {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int a[][] = new int[m][n];
		
		for (int i = 0; i < a.length; i++) {
			a[i][0] = 1;
		}
		
		for (int i = 0; i < a[0].length; i++) {
			a[0][i] = 1;
		}
		
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				a[i][j] = a[i-1][j] + a[i][j-1];
			}
		}
		
		System.out.println(a[m-1][n-1]);
	}

}
