class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int l=pref.length();
        for(String word:words){
            if(word.length()>=l && word.substring(0,l).equals(pref)){
                count++;
            }
        }
        return count;
    }
}