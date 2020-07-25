package arrays;

import java.util.Arrays;

/* John is working as a clerk in an organization where N number of people are working. 
 * His boss has asked him to get the count of employees who get same salary. 
 * Help him to get the count of repeated salary.
 */

public class RepeatedSalaryCount {
	
	public static void main(String[] args) {
		
		int count=0;
		
		int a[] = {1000,1000,3500,2000,1500};
		
		int n =a.length;
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(a[i]==a[j]) {
					
					count=count+2;
					
					for(int k=j;k<n-1;k++) {
						
						a[k]=a[k+1];
						
					}
					
					n--;
					
				}
				
			}
			
		}
		
		System.out.println(count);
		
 		
	}

}
