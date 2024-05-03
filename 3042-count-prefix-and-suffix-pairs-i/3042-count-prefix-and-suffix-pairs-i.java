class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(PrefixSuffixPairs(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean PrefixSuffixPairs(String s1,String s2){
        int first=s1.length();
        int second=s2.length();
        if(first>second) return false;
        String s3=s2.substring(second-first,second);
        String s4=s2.substring(0,first);
        if(s3.equals(s1) && s4.equals(s1)){
            return true;
        }
        return false;
    } 
}