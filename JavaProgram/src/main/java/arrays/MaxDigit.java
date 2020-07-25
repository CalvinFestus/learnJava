package arrays;

public class MaxDigit {
	
/*
Input:  x = 12234
Output: The most frequent digit is 2

Input:  x = 1223377
Output: The most frequent digit is 7

Input:  x = 5
Output: The most frequent digit is 5

Input:  x = 1000
Output: The most frequent digit is 0
*/
	
	public static void main(String[] args) {
		
		int x;
		int count, max=0, res=0;
		
		for(int i=0;i<=9;i++) {
			x = 1223377;
			count=0;
			
			while(x>0) {
							
				if((x%10)==i) {
					count++;
				}
				
				x=x/10;
				
			}
			
			if(count>=max) {
				max=count;
				res=i;
			}
			
		}
		
		System.out.println(res);
		
		
	}

}
