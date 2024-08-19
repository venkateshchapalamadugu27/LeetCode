class Solution {
    public boolean validPalindrome(String s) {
        int start=0,end=s.length()-1;
        int count=0;
       while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                // Check both the possibilities i.e., skipping either the start or the end character
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }

        return true;

    }
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}