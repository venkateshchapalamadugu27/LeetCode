class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        boolean result= (check(s1,s2) || check(s2,s1) );
        return result;
    }
    private boolean check(String word1, String word2){
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>arr2[i]) return false;
        }
        return true;
    }
}