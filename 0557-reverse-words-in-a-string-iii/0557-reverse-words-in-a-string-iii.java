class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        System.out.println(Arrays.toString(words));
        String res="";
        for(String word:words){
            String rev=reverse(word);
            res+=rev+" ";
        }
        return res.trim();
    }
    private String reverse(String word){
        StringBuilder sb=new StringBuilder();
        sb.append(word);
        sb=sb.reverse();
        return sb.toString();
    }
}