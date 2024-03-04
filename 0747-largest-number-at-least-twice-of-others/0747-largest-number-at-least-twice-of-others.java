class Solution {
    public int dominantIndex(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
       int max=arr[arr.length-1];
       for(int i=0;i<arr.length-1;i++){
           if(max<arr[i]*2){
               return -1;
           }
       }
       for(int i=0;i<nums.length;i++){
           if(nums[i]==max){
               return i;
           }
       }
       return 0;
    }
}