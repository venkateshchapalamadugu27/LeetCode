class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=1;
        }
        int mod = 1000000007;
        while(k>0){
            for(int i=1;i<nums.length;i++){
                nums[i]=(nums[i]+nums[i-1])%mod;
            }
            k--;
        }
        return nums[n-1]%mod;
    }
}