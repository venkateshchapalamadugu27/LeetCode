class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<5){
            return 0;
        }
        
        Arrays.sort(nums);
        int k=nums.length-1;
        int sum=nums[k]-nums[0];
        
        for(int i=0;i<=3;i++){
            sum=Math.min(sum,nums[k-(3-i)]-nums[i]);
        }
        return sum;
    }
}

// nums.length=5
// [1,5,0,10,14]