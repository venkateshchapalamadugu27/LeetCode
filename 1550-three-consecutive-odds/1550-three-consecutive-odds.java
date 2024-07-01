class Solution {
    public boolean threeConsecutiveOdds(int[] nums) {
        if(nums.length <3) return false;
        for(int i=0;i<nums.length-2;i++){
            if(isOdd(nums[i],nums[i+1],nums[i+2])) return true;
        }
        return false;
    }

    private static boolean isOdd(int a,int b,int c){
        return (a%2==1 && b%2==1)&& c%2==1 ;
    }
}