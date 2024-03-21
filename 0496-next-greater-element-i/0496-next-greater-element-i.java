class Solution {
    /*
        In this method I created two more methods and resultant int array and 
        using both methods I keep tracking of the answers. 
    */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] res=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
           int index=element(nums1[i],nums2);
           res[i]=elementGreat(nums1[i],index,nums2);
       } 

       return res;
    }
    /* In this method I keep tracking of the present number in the nums1 and returned the position
    of the number in the nums2.*/
    private static int element(int currNum,int[] nums2){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==currNum){
                return i;
            }
        }
        return 0;
    }
    /* In this method I just checked the right side of the nums2 using index if any numbers are greater than 
       current numbner in the nums2.
     */
    private int elementGreat(int num,int index,int[] nums2){
        for(int i=index;i<nums2.length;i++){
            if(nums2[i]>num){
                int ret=nums2[i];
                return ret;
            }
        }
        return -1;
    }
}