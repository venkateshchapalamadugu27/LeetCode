class Solution {
    public int numberOfSpecialChars(String word) {
       int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (word.indexOf(c) != -1 && 
                word.indexOf((char)(c - 32)) != -1 &&
                word.lastIndexOf(c) < word.indexOf((char)(c - 32))) {
                count++;
               }
            }
        return count;
    }
}