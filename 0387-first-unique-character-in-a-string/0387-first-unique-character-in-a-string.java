class Solution {
    public int firstUniqChar(String s) {
       int[] arr1=new int[26];
       for(char c:s.toCharArray()){
           arr1[c-'a']++;
       }
       for(int i=0;i<s.length();i++){
         if(arr1[s.charAt(i)-'a']==1){
            return i;
         }
       }
       return -1;
    }
}