class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        res[0]=search(nums,target,true);
        res[1]=search(nums,target,false);
        return res;
    }
    public int search(int[] nums,int target,boolean findIndex){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                ans=mid;
                if(findIndex){
                   e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}