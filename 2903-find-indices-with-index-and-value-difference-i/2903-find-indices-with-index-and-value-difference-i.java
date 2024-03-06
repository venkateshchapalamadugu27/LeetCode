class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        // List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(i-j)>= indexDifference  && Math.abs(nums[i] - nums[j]) >= valueDifference){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}