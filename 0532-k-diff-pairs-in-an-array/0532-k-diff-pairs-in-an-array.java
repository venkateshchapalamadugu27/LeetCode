class Solution {
    public int findPairs(int[] nums, int k) {
        int res=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[j]-nums[i])==k && !list.contains(nums[j]+nums[i])){
                    res++;
                    list.add(nums[j]+nums[i]);
                }
            }
        }
        return res;
    }
}
