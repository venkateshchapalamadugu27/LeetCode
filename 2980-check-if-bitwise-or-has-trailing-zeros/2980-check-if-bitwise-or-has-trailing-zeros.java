class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
            if(hasTrailingZeros(nums[i],nums[j])){
                return true;
            }
        }
        return false;
    }
    
    private boolean hasTrailingZeros(int a,int b){
        int z=(a|b);
        String s=Integer.toBinaryString(z);
        return s.charAt(s.length()-1)=='0';
    }
}