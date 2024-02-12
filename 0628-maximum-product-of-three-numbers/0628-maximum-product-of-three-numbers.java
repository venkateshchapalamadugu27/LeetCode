class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       int prod=nums[0]*nums[1]*nums[nums.length-1];
        int prod1=nums[nums.length-1]*nums[nums.length-3]*nums[nums.length-2];
        return Math.max(prod,prod1);
    }
}