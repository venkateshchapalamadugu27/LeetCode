class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(isEven(nums[i],nums[i-1]) || isOdd(nums[i],nums[i-1])){
                return false;
            }
        }
        return true;
    }
    
    private static boolean isEven(int i,int j){
         return i%2==0 && j%2==0 ;
    }
    private static boolean isOdd(int i,int j){
         return i%2==1 && j%2==1 ;
    }
    
}