class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int minIndex=Integer.MAX_VALUE,maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                minIndex=Math.min(i,minIndex);
                maxIndex=Math.max(i,maxIndex);
            }
        }

        return maxIndex-minIndex;
    }

    private boolean isPrime(int a){
        int count=0;
        if(a<2) return false;
        for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    return false;
                }
            }
        return true;     
    }
}