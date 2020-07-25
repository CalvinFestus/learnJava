package arrays;

import java.util.Scanner;

public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				int min = Math.min(arr[i],arr[j]);
				
				max = Math.max(max, min * (j-i));
				
				
			}
		}
		
		System.out.println(max);
		
	}

}
