class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)) return c;
            set.add(c);
        }
        return ' ';
    }
}