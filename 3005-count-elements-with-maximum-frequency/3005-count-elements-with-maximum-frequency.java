class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        for(int num:nums){
            arr[num]++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                ans+=arr[i];
            }
        }
        return ans;
    }
}