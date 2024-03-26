class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=Arrays.stream(nums).sum();
        if(sum<target || -sum>target) return 0;

        return find(0,0,nums,target);
    }
    private static int find(int i,int sum,int[] nums,int target){
        if(i>=nums.length) return sum==target ? 1:0 ;
        int e1=find(i+1,sum+nums[i],nums,target);
        int e2=find(i+1,sum-nums[i],nums,target);
        return e1+e2;
    }
}