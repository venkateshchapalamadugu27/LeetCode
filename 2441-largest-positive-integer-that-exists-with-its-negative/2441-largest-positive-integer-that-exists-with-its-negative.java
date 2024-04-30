class Solution {
    public int findMaxK(int[] nums) {
        int result=-1;
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            if(set.contains(-x)){
                if(result<Math.abs(x)){
                    result=Math.abs(x);
                }
            }
            set.add(x);
        }
        return result;
    }
}