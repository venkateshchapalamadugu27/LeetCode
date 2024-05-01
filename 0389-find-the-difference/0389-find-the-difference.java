class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        Character res='\0';

        for(char c:s.toCharArray()){
            freq1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            freq2[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq2[i]>freq1[i]){
                res=(char)(i+'a');
            }
        }
        return res;
    }
}