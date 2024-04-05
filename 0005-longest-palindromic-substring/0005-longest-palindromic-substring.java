class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        String res=String.valueOf(s.charAt(0));
        // if(s.length()<=1){
        //     return s;
        // }
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                 String curr=isPalindrome(s.substring(i,j+1));
                 if(curr.length()>max){
                    res=curr;
                    max=curr.length();
                 }
            }
        }
        return res;
    }
    private static String isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return "";
            }
            i++;j--;
        }
        return s;
    }
}