class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list=new ArrayList<>();
        int num=0;
        for(int i=0;i<nums.length;i++){
            num = (num*2 + nums[i])%5;
            list.add(num==0);
        }
        
        return list;
    }
}