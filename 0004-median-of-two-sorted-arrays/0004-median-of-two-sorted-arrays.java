class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums1){
            list.add(num);
        }
        for(int num:nums2){
            list.add(num);
        }
        Collections.sort(list);
        if(list.size()%2==0){
           double res= list.get(list.size()/2)+list.get(list.size()/2 -1);
            return res/2;
        }
        return (double)list.get(list.size()/2);
    }
}