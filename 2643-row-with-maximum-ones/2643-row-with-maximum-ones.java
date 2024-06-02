class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res=new int[2];
        int maxOne=0;
        for(int row=0;row<mat.length;row++){
            int count=0;
            for(int col=0;col<mat[row].length;col++){
                if(mat[row][col]==1){
                    count++;
                }
            }
            if(count>maxOne){
                res[0]=row;
                res[1]=count;
                maxOne=count;
            }
        }
        return res;
    }
}