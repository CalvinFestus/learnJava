package arrays;

import java.util.Scanner;

public class MoveZerosToEnd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp,j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
