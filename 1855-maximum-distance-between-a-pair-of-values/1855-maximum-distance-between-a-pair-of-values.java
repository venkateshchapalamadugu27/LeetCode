class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=0,i=0,j=0,p=0,q=0;
        while(p<nums1.length && q<nums2.length){
            if(nums2[q]>=nums1[p]){
                max=Math.max(max,q-p);
                q++;
            }
            else{
                p++;
            }
            
        }
        return max;
    }
}