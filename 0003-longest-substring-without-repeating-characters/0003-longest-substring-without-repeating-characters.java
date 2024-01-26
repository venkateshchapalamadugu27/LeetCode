class Solution {
    public int lengthOfLongestSubstring(String s) {
        String old = "";
        String New = "";
        for (int i = 0; i < s.length(); i++) {
            if (!old.contains(String.valueOf(s.charAt(i)))) {
                old += s.charAt(i);
            } 
            else{
                if (old.length() > New.length()) {
                    New = old;
                }
                old = old.substring(old.indexOf(s.charAt(i)) + 1) + s.charAt(i);
            }
         }
        if (old.length() > New.length()) {
            New = old;
        }
        return New.length();
    }
}
