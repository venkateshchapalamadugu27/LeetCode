class Solution {
    public int findClosestNumber(int[] nums) {
        int closeNum=Integer.MAX_VALUE;
        int minDiff=Integer.MAX_VALUE;
        for(int num:nums){
            int currentDiff=Math.abs(num-0);
            if(currentDiff<minDiff ||  (currentDiff==minDiff  && num>closeNum)){
                minDiff=currentDiff;
                closeNum=num;
            }
        }
        return closeNum;
    }
}