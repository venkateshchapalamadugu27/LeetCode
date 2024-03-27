class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        if(k<=1) return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                count++;
            }
            int prod=nums[i];
            for(int j=i+1;j<nums.length;j++){
                prod=prod*nums[j];
                if(prod<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        
        return count;
    }
}