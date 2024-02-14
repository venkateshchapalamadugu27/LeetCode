class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int num:nums){
            if(num>0){
                list1.add(num);
            }
            else{
                list2.add(num);
            }
        }
        int[] res=new int[nums.length];
        int p=0,n=1;
        for(int num:list1){
            res[p]=num;
            p=p+2;
        }
        for(int num:list2){
            res[n]=num;
            n=n+2;
        }
        return res;
    }
}