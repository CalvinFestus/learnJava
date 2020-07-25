package arrays;

/*Write a program to find the product of the digits in the given input number.*/

public class ProductOfDigits {
	
	public static void main(String[] args) {
		
		int num = 2569;
		
		int prod =1;
		
		int rem;
		
		while(num>0) {
			rem = num%10;
			prod = prod*rem;
			num = num/10;
		}
		
		System.out.println(prod);
		
	}

}
