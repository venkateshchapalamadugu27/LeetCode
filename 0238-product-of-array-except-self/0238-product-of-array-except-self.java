// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int prod=1;
//         int prod1=1;
//         int c=0;
//         for(int n:nums){
//             prod=prod*n;
//             if(n!=0){prod1=prod1*n;}
//         }
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0){nums[i]=prod/nums[i];}
//             else{
//                 nums[i]=prod1;
//             }
//         }
//         return nums;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Create arrays to store the product of elements to the left and right of each element
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        
        // Initialize the leftProducts array
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        // Initialize the rightProducts array
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        // Calculate the final result
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        
        return result;
    }
}
