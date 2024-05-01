class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch))) return word;

        int lastIndex=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                lastIndex=i;
                break;
            }
        }
        
        StringBuilder sb=new StringBuilder(word.substring(0,lastIndex+1));
        sb.reverse();
        String result=sb.toString();
        return result+word.substring(lastIndex+1,word.length());
    }
}