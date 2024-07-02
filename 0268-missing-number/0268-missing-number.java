class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int actualSum=l*(l+1)/2;
        return actualSum-sum;
    }
}