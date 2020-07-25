package arrays;

/*Given an Integer array, find out sum of Even and odd Numbers individually and find the maximum.*/

public class MaximumSum {
	
	public static void main(String[] args) {
		
		int even=0,odd=0;
		
		int a[] = {12,13,14,15,16,17,18,19};
		int n = a.length;
		
		
		for(int i=0;i<n;i++) {
			
			if(a[i]%2==0) {
				even = even + a[i];
			}else {
				odd = odd+a[i];
			}
			
		}
		
		if(odd>even) {
			System.out.println(odd);
		}else {
			System.out.println(even);
		}
		
		
	}

}


