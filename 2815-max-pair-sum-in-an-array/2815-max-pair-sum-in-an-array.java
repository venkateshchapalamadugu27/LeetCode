class Solution {
    public int maxSum(int[] nums) {
        int max=-1,currMax=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int imax=maxDigit(nums[i]);
                int jmax=maxDigit(nums[j]);
                if(imax==jmax){
                    currMax=nums[i]+nums[j];
                    max=Math.max(max,currMax);
                }
            }
        }
        return max;
    }
    public int maxDigit(int a){
        int max=0;
        while(a>0){
            int rem=a%10;
            max=Math.max(max,rem);
            a=a/10;
        }
        return max;
    }
    
}