class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] arr=new int[nums.length];
        for(int i=0;i<queries.length;i++){
            nums[queries[i][1]]=nums[queries[i][1]]+queries[i][0];
            int sum=0;
            for(int j=0;j<nums.length;j++){
               if(nums[j]%2==0){
                   sum+=nums[j];
               }
            }
            arr[i]=sum;
        }

        return arr;
    }
}