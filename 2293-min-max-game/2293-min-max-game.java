class Solution {
    public int minMaxGame(int[] nums) {
        // ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
         int[] newNums=new int[n/2];
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n/2;i++){
            if(i%2==0){
               newNums[i]=Math.min(nums[2 * i], nums[2 * i + 1]);
            }
            else{
                 newNums[i]=Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
    
        return minMaxGame(newNums);
    }
}