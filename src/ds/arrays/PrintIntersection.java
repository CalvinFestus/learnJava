package ds.arrays;

import org.junit.Test;

public class PrintIntersection {
	
	private void getTheIntersection (int[] numbers1, int[] numbers2) {
		
		int length1 = numbers1.length;
		int length2 = numbers2.length;
		
		int i=0,j=0;
		
		while(i<length1 && j<length2) {
			if(numbers1[i]<numbers2[j]) {
				i++;
			}else if(numbers2[j]<numbers1[i]){
				j++;
			}else {
				System.out.println(numbers2[j]);
				i++;
				j++;
			}
		}
		
		
		
	}


	@Test
	public void example1() {
		int[] numbers1 = {1,2,4,5};
		int[] numbers2 = {2,4,7,9};
		getTheIntersection(numbers1,numbers2);
	}
	
	@Test
	public void example2() {
		int[] numbers1 = {5,6,8,9};
		int[] numbers2 = {8,9,10,11};
		getTheIntersection(numbers1,numbers2);
	}

}
