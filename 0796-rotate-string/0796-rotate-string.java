class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()) return false;
        String sb= s+s ;
        return sb.contains(goal);
    }
}