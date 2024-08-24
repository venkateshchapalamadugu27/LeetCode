class Solution {
    public int minPathSum(int[][] grid) {
        // System.out.println(pathList(0,grid,grid.length-1,grid[0].length-1));
        // ArrayList<Integer> list=pathList(0,grid,grid.length-1,grid[0].length-1);
        // Collections.sort(list);
        // return list.get(0)+1;

        return helper(grid);
    }

// 1 4 5
// 2 5 1
// 6 2 1

    int helper(int[][] grid){
       int row=grid.length;
       int col=grid[0].length;

       for(int i=1;i<col;i++){
          grid[0][i]+=grid[0][i-1];
       }

       for(int i=1;i<row;i++){
          grid[i][0]+=grid[i-1][0];
       }

       for(int i=1;i<row;i++){
        for(int j=1;j<col;j++){
            grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
        }
       }

       return grid[row-1][col-1];

    }


    public static ArrayList<Integer> pathList(int p,int[][] grid ,int r, int c){
        if(r==0 && c==0){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<Integer> list=new ArrayList<>();
        if(r>0){
           list.addAll(pathList(p+grid[r][c],grid,r-1,c));
        }
        if(c>0){
            list.addAll(pathList(p+grid[r][c],grid,r,c-1));
        }
        return list;
    }
}



