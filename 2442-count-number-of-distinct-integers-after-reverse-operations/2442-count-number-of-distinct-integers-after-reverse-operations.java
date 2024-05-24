class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    private int reverse(int num){
        if(num<10) return num;
        int res=0;
        while(num>0){
            int rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        return res;
    }
}