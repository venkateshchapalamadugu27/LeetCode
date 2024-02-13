class Solution {
    public String firstPalindrome(String[] words) {
        for(String st:words){
            if(isPalindrome(st)){
                return st;
            }
        }
        return "";
    }
    private boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}