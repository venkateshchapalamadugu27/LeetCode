class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    callBFS(grid,i,j);
                }
            }
        }
        return count;
    }
    private void callBFS(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0') return ;
        
        grid[i][j]='0';
        callBFS(grid,i-1,j);//left
        callBFS(grid,i+1,j);//right 
        callBFS(grid,i,j-1);//above
        callBFS(grid,i,j+1);//below
    }
}