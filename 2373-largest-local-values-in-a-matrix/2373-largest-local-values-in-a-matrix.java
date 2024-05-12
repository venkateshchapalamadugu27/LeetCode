class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                 res[i][j]=helper(grid,i,j);
            }
        }
         return res;
    }

    private int helper(int[][] grid,int start,int end){
       int max=0;
       for(int i=start;i<start+3;i++){
        for(int j=end;j<end+3;j++){
            max=Math.max(max,grid[i][j]);
         }
       }
       return max;
    }
}