package arrays;

public class MinimumSumPath {
	
	public static void main(String[] args) {
		
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1}  }; 
		
		if(grid == null || grid.length==0){
            System.out.println(0);;
        }
        
        int a[][] = new int[grid.length][grid[0].length];
        
        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<a[i].length;j++){
                
                a[i][j] += grid[i][j];
                
                if(i>0 && j>0){
                    
                    a[i][j] += Math.min(a[i-1][j],a[i][j-1]); 
                    
                }else if (i>0){
                    
                    a[i][j] += a[i-1][j];
                    
                }else if (j>0){
                    
                    a[i][j] += a[i][j-1];
                    
                }
                
                
            }
            
        }
        
        System.out.println(a[a.length-1][a[0].length-1]);
		
	}

}
