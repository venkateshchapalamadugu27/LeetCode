class Solution {
    public int countDistinctIntegers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int a:nums){
            list.add(a);
        }
        for(int i=0;i<nums.length;i++){
            list.add(reverse(nums[i]));
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        return set.size();

    }
    private int reverse(int num){
        int res=0;
        while(num>0){
            int rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        return res;
    }
}