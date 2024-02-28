class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                   if(isPalindrome(words[i],words[j])){
                       count++;
                   }
            }
        }
        return count;
    }


    private boolean isPalindrome(String first,String second){
        return first.charAt(0)==second.charAt(1) && first.charAt(1)==second.charAt(0); 
    }
}