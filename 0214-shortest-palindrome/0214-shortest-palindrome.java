class Solution {
    public String shortestPalindrome(String s) {
        

        int len=s.length();
        String str=new StringBuilder(s).reverse().toString();
        for(int i=0; i<len; i++)
        {
            if(s.substring(0, len-i).equals(str.substring(i,len)))
            {
                return new StringBuilder(str.substring(0,i)).append(s).toString();
            }
        }
        return "";
    }
}