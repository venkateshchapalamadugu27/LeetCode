class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dict = new HashSet<>();
        for (String word : dictionary) {
            dict.add(word);
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        
        // Initialize dp array with maximum possible extra characters
        for (int i = 0; i <= n; i++) {
            dp[i] = i; // maximum extra characters if no substrings are used
        }

        dp[0] = 0; // base case, no characters used before the string starts
        
        // Iterate through each position in the string
        for (int i = 1; i <= n; i++) {
            // Check each possible start position for the substring ending at i-1
            for (int j = 0; j < i; j++) {
                // Substring from index j to i-1
                String substring = s.substring(j, i);
                if (dict.contains(substring)) {
                    // If the substring is in the dictionary, no extra characters for this segment
                    dp[i] = Math.min(dp[i], dp[j]);
                } else {
                    // If the substring is not in the dictionary, count all characters as extra
                    dp[i] = Math.min(dp[i], dp[j] + (i - j));
                }
            }
        }

        return dp[n];
    }
}