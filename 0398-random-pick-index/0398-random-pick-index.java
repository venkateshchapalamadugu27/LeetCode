class Solution {
    int[] nums;
    public Solution(int[] nums) {
        this.nums=nums;
    }
    
    public int pick(int target) {
        Random random = new Random();
        int count=0,r=-1;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==target){
            count++;
            if(random.nextInt(count)==0){
                   r=i;
               }
          }
        }

        return r;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */