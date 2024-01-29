class Solution {
    public int missingNumber(int[] nums) {
         int count=nums.length;
         int sum=0;
         for(int num:nums){
             sum+=num;
         }
         return (count*(count+1)/2)-sum;

    }
}