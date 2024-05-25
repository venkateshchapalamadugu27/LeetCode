class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr=sentence.split("\\s+");
        int l=searchWord.length();
        for(int i=0;i<arr.length;i++){
           String word=arr[i];
           if(word.length()>=l && word.substring(0,l).equals(searchWord)) return i+1;
        }
        return -1;
    }
}