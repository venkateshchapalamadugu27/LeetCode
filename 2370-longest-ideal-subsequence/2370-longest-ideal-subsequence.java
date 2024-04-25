class Solution {
    public int longestIdealString(String s, int k) {
        int[] cache=new int[26];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            int max=0;
            for(int j=Math.max(0,index-k);j<=Math.min(25,index+k);j++){
                max=Math.max(max,cache[j]);
            }
            cache[index]=max+1;
        }

        return Arrays.stream(cache).max().getAsInt();
    }
}