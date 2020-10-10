package day4.hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class WeekestRowsInAMatrix_Method2 {

	@Test
	public void example1() {

		int arr[][] = { {1,1,0,0,0}, 
				{1,1,1,1,0}, 
				{1,0,0,0,0},
				{1,1,0,0,0},
				{1,1,1,1,1}
		}; 
		int k = 3;

		int[] kWeakestRows = kWeakestRows(arr,k);
		System.out.println(Arrays.toString(kWeakestRows));

	}

	public int[] kWeakestRows(int[][] mat, int k) {

		int[] ans = new int[k];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < mat.length; i++) {
			int sum=0;
			for (int j = 0; j < mat[i].length; j++) {
				sum = sum + mat[i][j];
			}
			map.put(i, sum);
		}

		System.out.println(map);

		List<Map.Entry<Integer, Integer>> capitalList = new LinkedList<>(map.entrySet());

		Collections.sort(capitalList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

		System.out.println(capitalList);
		int ind = 0;


		for (Entry<Integer, Integer> entry : capitalList) {
			
			if(ind<k) {
				ans[ind] = entry.getKey();
				ind++;
			}
			
		}



		return ans;
	}
}