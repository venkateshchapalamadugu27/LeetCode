class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                count++;
            }
            int currGCD=nums[i];
            for(int j=i+1;j<nums.length;j++){
                currGCD= gcd(currGCD,nums[j]);
                if(currGCD==k){
                    count++;
                }
            }
        }
        return count;
    }
    private static int gcd(int a,int b){
       if(b==0){
        return a;
       }
       return gcd(b,a%b);
    }
}