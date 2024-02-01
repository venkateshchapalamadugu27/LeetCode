class Solution {
    public int[] kWeakestRows(int[][] matrix, int k) {
        int[] dp=new int[matrix.length];
        int[] dp2=new int[matrix.length];
        int row=matrix.length;
        int col=matrix[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1) count++;
            }
            dp[i]=count;
            dp2[i]=count;
            count=0;
        }
        int[] res=findThreeMinIndices(dp,dp2,k);
        return res;
    }

    public static int[] findThreeMinIndices(int[] arr1,int[] dp2,int k) {
        int[] indices = new int[k];
        Arrays.sort(dp2);
        for(int i=0;i<k;i++){
            int num=dp2[i];
            for(int j=0;j<arr1.length;j++){
                 if(arr1[j]==num){
                    indices[i]=j;
                    arr1[j]=-1;
                    break;
                 }
            }
        }

        return indices;
    }
}