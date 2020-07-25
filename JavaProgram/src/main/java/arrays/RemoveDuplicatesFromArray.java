 package arrays;

import java.util.Scanner;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0;
		int temp[] = new int[n];
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				temp[j]=arr[i-1];
				j++;
			}
			
		}
		temp[j++]=arr[n-1];
		
		System.out.println(temp.length);
		
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]);
		}
		
	}

}
