package arrays;

public class RemoveDuplicatesWithoutCollections {
	
public int removeDuplicates(int[] nums) {
        
        
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++) {
                
                if(nums[i]==nums[j]){
                    
                    nums[j] = nums[n-1];
                    n--;
                    j--;
                }
                
            }           
             
            
        }
        int temp;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
            	
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums [j];
                    nums[j] = temp;
                }             
            }
        }
         
        
        return n;
        
    }

}
