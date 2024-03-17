class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int o=0,e=0;
        int[] odd=new int[nums.length/2];
        int[] even=new int[nums.length/2];
        for(int num:nums){
            if(num%2==0){
                odd[o++]=num;
            }
            else{
                even[e++]=num;
            }
        }
        int i=0,j=1;
        for(int num:odd){
            res[i]=num;
            i=i+2;
        }
        for(int num:even){
            res[j]=num;
            j=j+2;
        }
        return res;
    }
}