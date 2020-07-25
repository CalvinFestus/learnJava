package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IterateAList {
	
	public static void main(String[] args) {
		
		int n=5;
		List<List<Integer>> aList =  
                new ArrayList<>(n); 
		System.out.println(aList.size());
		aList.add(Arrays.asList(0,1,2));
		aList.add(Arrays.asList(0,1,3));
		aList.add(Arrays.asList(0,1,4));
		List<Integer> asList = Arrays.asList(0,1,2);
		System.out.println(aList.get(0));
		boolean equals = aList.get(0).equals(aList.get(1));
		System.out.println(equals);
		if(!aList.get(0).equals(aList.get(1))) {
			System.out.println("Passed");
		}
		
	}

}
