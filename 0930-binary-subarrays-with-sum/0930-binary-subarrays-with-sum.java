class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum==goal){
                    count++;
                }
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal){
                    count++;
                }
                if(sum>goal) break;
            }
        }
        return count;
    }
}