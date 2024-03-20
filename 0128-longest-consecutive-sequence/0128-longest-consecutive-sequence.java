class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int max=1,last=nums[0],count=0;
        for(int i=1;i<nums.length;i++){
            if(last+1==nums[i]){
                count+=1;
            }
            else if(last==nums[i]){
                continue;
            }
            else{
                max=Math.max(max,count+1);
                count=0;
            }
            last=nums[i];
        }
        return Math.max(max,count+1);
    }
}