class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] result=new int[nums.length];
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
    }
    
    private void swap(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }
}