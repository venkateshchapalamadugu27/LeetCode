class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            arr1[index]=i;
        }

        for(int j=0;j<t.length();j++){
            int index=t.charAt(j)-'a';
            arr2[index]=j;
        }

        int res=0;
        for(int i=0;i<26;i++){
            res+=Math.abs(arr1[i]-arr2[i]);
        }

        return res;
    }
}