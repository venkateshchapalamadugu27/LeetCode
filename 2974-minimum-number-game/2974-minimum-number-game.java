class Solution {
    public int[] numberGame(int[] nums) {
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i=i+2){
           swap(nums,i,i+1);
       }
        return nums;
        
    }
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}