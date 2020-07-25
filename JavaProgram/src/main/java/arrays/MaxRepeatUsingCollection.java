package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
Input : arr[] = {1, 3, 2, 1, 4, 1}
Output : 1
1 appears three times in array which is maximum frequency.

Input : arr[] = {10, 20, 10, 20, 30, 20, 20}
Output : 20
*/

public class MaxRepeatUsingCollection {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		// int arr[] = {5,4,2,2,3,4,4,2,1,5,3};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
			
		}
		System.out.println(map);
		int max=0,val = 0;
		for (Entry<Integer, Integer> mp : map.entrySet()) {
			
			if(mp.getValue()>max) {
				max=mp.getValue();
				val=mp.getKey();
			}
			
		}
		System.out.println(val);
		
		
	}

}
