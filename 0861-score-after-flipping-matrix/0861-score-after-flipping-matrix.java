class Solution {
    public int matrixScore(int[][] grid) {
        int colCount=grid[0].length;
        int rowCount=grid.length;
        int score=0;
        for(int col=colCount-1;col>=0;col--){
            int colSum=0;
            for(int row=rowCount-1;row>=0;row--){
                if(grid[row][col]==grid[row][0]){
                    colSum++;
                }
            }
            score+=Math.max(colSum,rowCount-colSum)<<(colCount-col-1);
        }
        return score;
    }
}