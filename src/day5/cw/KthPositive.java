package day5.cw;

import org.junit.Test;

public class KthPositive {

	private int getKthPositive (int[] arr,int k) {

		int missed =0;

		for (int i = 0; i < arr.length; i++) {

			if(i==0) {
				missed += arr[0]-1;

				if(missed>=k) {
					return k;
				}

			}else {
				missed +=arr[i]-arr[i-1]-1;
				
				if(missed>=k) {
					missed -=arr[i]-arr[i-1]-1;
					int result = arr[i-1];
					while(missed<k) {
						result++;
						missed++;
					}
					return result;
				}
				
			}
			
		}
		int result = arr[arr.length-1];
		while(missed<k) {
			result++;
			missed++;
		}
		return result;
	}
		@Test
		public void example1() {
			int[] numbers = {2,3,4,7,11};
			int k=5;
			System.out.println("Set 1");
			int ans = getKthPositive(numbers,k);
			System.out.println(ans);
		}

		@Test
		public void example2() {
			int[] numbers = {3,4,5};
			int k=2;
			System.out.println("Set 2");
			int ans = getKthPositive(numbers,k);
			System.out.println(ans);
		}

	}
