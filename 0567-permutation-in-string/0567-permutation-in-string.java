class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int last=s1.length();
       for(int i=0;i<s2.length()-last+1;i++){
           if(isPermutation(s1,s2.substring(i,i+last))){
               return true;
           }
       }
       return false;
    }

    private static boolean isPermutation(String first,String last){
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for (char ch : first.toCharArray()) {
            sFreq[ch - 'a']++;
        }

        for (char ch : last.toCharArray()) {
            tFreq[ch - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(sFreq[i]!=tFreq[i]){
                return false;
            }
        }
        return true;
    }
}