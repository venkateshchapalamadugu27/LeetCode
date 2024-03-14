/*First check the individual numbers in the nums that sum up to goal or not.
Then iterate through elements and check cummulative sum from index 0 to 1,index o to 2 and so....on.
If it exceeds goal break inner loop and increase i by 1 and check index 1 to 2 and index 1 to 3 and so...on.
If sum==goal icrease count by 1.At last return count value.  */
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum==goal){
                    count++;
                }
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal){
                    count++;
                }
                if(sum>goal) break;
            }
        }
        return count;
    }
}