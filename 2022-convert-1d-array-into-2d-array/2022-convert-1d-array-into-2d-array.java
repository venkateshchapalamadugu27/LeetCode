class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result=new int[m][n];
        int x=0;
        if(original.length != m*n){
           return new int[0][0];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=original[x++];
            }
        }
        
        return result;
    }
}