class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int currGCD=nums[i];
            if(nums[i]==k) count++;
            for(int j=i+1;j<nums.length;j++){
                currGCD=(currGCD*nums[j])/gcd(currGCD,nums[j]);
                if(currGCD==k){
                    count++;
                }
                else if(currGCD>k){break;}
            }
        }
        return count;
    }
    private static int gcd(int a,int b){
       if(a==0){
        return b;
       }
       return gcd(b%a,a);
    }
}