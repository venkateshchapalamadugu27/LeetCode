class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int last=p.length();
        for(int i=0;i<s.length()-last+1;i++){
            if(isAnagram(s.substring(i,i+last),p)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isAnagram(String first,String last){
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