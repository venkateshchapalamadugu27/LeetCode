/* 
    Maintained two arrays i.e., prefix arry and suffix array(excluding the irrespective of first index).
    for input 1 :- prefix=[1,8,11,17,22,28] 
                   suffix=[28,27,20,17,11,7] at index 3 both have same sum.Therefore it is the pivot index.      
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }

        for(int i=0;i<prefix.length;i++){
            if(prefix[i]==suffix[i]){
                return i;
            }
        }
        return -1;

    }
}