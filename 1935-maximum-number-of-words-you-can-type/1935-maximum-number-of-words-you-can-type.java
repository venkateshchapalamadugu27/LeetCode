class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split("\\s+");
        int count=0;
        System.out.println(Arrays.toString(arr));
        for(String word:arr){
            if(isFound(word,brokenLetters)){
                count++;
            }
        }
        return count;
    }
    private boolean isFound(String word,String brokenLetters){
        for(char c:brokenLetters.toCharArray()){
            if(word.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}