class Solution {
    public int matrixSum(int[][] nums) {
        int score=0;
        int col=nums[0].length;
        int row=nums.length;
        for(int[] a :nums)
        {
            Arrays.sort(a);
        }
        for(int j=0;j<col;j++){
            int max=-1;
            for(int i=0;i<row;i++){
                max=(nums[i][j]>max)?nums[i][j] : max ;
            }
            score+=max;
        }
        return score;
    }
}