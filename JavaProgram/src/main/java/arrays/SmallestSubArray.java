package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SmallestSubArray {
	
/*
Input :  arr[] = {4, 1, 1, 2, 2, 1, 3, 3} 
Output :   1, 1, 2, 2, 1
The most frequent element is 1. The smallest subarray that has all occurrences of it is 1 1 2 2 1

Input :  A[] = {1, 2, 2, 3, 1}
Output : 2, 2
Note that there are two elements that appear two times, 1 and 2. 
The smallest window for 1 is whole array and smallest window for 2 is {2, 2}. 
Since window for 2 is smaller, this is our output.
*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		int max = 0, length = -1, startIndex = -1;
		
		for(int i=0;i<n;i++) {
			
			int x = arr[i];
			
			if(!count.containsKey(x)) {
				left.put(x, i);
				count.put(x, 1);
			}else {
				count.put(x, count.get(x)+1);
			}
			
			if(count.get(x)>max) {
				max = count.get(x);
				startIndex = left.get(x);
				length = i - left.get(x) + 1;
			}else if(count.get(x)==max && (i - left.get(x) + 1)<length){
				startIndex = left.get(x);
				length = i - left.get(x) + 1;
			}
			
		}
		
		for(int i=startIndex;i<length+startIndex;i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
	}

}
