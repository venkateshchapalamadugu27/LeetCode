class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String str="aeiou";
        int count=0;
        for(int i=left;i<=right;i++){

            // String word=words[i];
            char f=words[i].charAt(0),l=words[i].charAt(words[i].length()-1);
            // char l=word.charAt(word.length()-1);
            if(str.contains(String.valueOf(f)) && str.contains(String.valueOf(l))){
                count++;
            }

        }
        return count;
    }
}