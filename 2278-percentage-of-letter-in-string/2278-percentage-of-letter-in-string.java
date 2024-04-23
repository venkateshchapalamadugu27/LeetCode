class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        if(!s.contains(String.valueOf(letter))){
            return 0;
        }
       for (char c : s.toCharArray()) {
           if (c == letter) {
                count++;
            }
}
        return (int)((count*100/s.length()));
    }
}