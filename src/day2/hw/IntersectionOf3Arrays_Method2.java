package day2.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class IntersectionOf3Arrays_Method2 {
	
	private List<Integer> getIntersection (int[] arr1,int[] arr2,int[] arr3) {

		List<Integer> intersect = new ArrayList<Integer>();
		int i=0,j=0,k=0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				intersect.add(arr1[i]);
				i++;j++;k++;
			}else if (arr1[i] < arr2[j]) {
				i++;
			}else if (arr2[j] < arr3[k]) {
				j++;
			}else {
				k++;
			}
			
		}

		return intersect;

	}


	@Test
	public void example1() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,5,7,9}; 
		int[] arr3 = {1,3,4,5,8}; 
		System.out.println("Set 1");
		List<Integer> intersectionArr = getIntersection(arr1,arr2,arr3);
		System.out.println(Arrays.toString(intersectionArr.toArray()));
	}

	@Test
	public void example2() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,5,7,9}; 
		int[] arr3 = {1,3,4,5,8}; 
		System.out.println("Set 2");
		List<Integer> intersectionArr = getIntersection(arr1,arr2,arr3);
		System.out.println(Arrays.toString(intersectionArr.toArray()));
	}


}
