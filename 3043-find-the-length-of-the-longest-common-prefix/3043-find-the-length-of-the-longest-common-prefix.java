class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            while(!set.contains(i)&&i>0){
                set.add(i);
                i/=10;
            }
        }
        int result=0;
        for(int i:arr2){
            while(!set.contains(i)&&i>0){
                i/=10;
            }
            if(i>0){
                result=Math.max(result,(int)(Math.log(i)/Math.log(10))+1);
            }
        }
        return result;
    }
}