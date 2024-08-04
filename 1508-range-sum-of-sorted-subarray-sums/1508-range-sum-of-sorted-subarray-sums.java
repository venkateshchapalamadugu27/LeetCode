class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
               sum+=nums[j];
               list.add(sum);
            }
        }
         
        Collections.sort(list);
        int mod=1000000007;
        int res=0;

        for(int i=left-1;i<right;i++){
            res=(res+list.get(i))%mod;
        }

        return res;
    }
}