class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String  word:words){
            if(isTrue(word,allowed)) count++;
        }
        return count;
    }
    private boolean isTrue(String word,String allowed){
        for(char c:word.toCharArray()){
            if(!allowed.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}