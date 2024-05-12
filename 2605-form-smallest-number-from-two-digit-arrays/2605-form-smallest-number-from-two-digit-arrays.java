class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        String s1=helper(nums1);
        String s2=helper(nums2);

        for(int i=0;i<nums1.length;i++){
            String x=Integer.toString(nums1[i]);
            if(s1.contains(x)&&s2.contains(x)){
                return Integer.parseInt(x);
            }
        }
        
        int[] res=new int[2];
        res[0]=Integer.parseInt(String.valueOf(s1.charAt(0)));
        res[1]=Integer.parseInt(String.valueOf(s2.charAt(0)));
        Arrays.sort(res);

        // String res=""+s1.charAt(0)+s2.charAt(0);

        return res[0]*10+res[1];
        
    }
    private String helper(int[] nums){
       String s="";
       for(int x:nums){
            s+=Integer.toString(x); 
        }
        return s;
    }
}