class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] arr=new int[51];
        for(int i:nums){
            arr[i]++;
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                res^=i;
            }
        }
        return res;
    }
}