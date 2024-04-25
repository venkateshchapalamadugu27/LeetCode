class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            int[] arr1=new int[n+1];
            int[] arr2=new int[n+1];
            for(int j=0;j<n;j++){
                arr1[matrix[i][j]]++;
                arr2[matrix[j][i]]++;
            }

            for(int k=1;k<=n;k++){
                if(arr1[k]!=1 || arr2[k]!=1){
                    return false;
                }
            }
        }
        return true;
    }
}