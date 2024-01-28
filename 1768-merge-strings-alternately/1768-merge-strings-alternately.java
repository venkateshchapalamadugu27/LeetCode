class Solution {
    public String mergeAlternately(String word1, String word2) {
        int first = word1.length();
        int second = word2.length();
        StringBuilder res = new StringBuilder(first + second);
        int minLength = Math.min(first, second);

        for (int i = 0; i < minLength; i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }

        if (first > second) {
            res.append(word1, minLength, first);
        } else {
            res.append(word2, minLength, second);
        }

        return res.toString();

    }
}