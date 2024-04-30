class Solution {
    public long wonderfulSubstrings(String word) {
        int[] count=new int[1024];
        int bitmask=0;
        long result=0;
        count[0]=1;

        for(char c:word.toCharArray()){
            int index=c-'a';
            bitmask=bitmask^1 << index ;
            result+=count[bitmask];
            for(int i=0;i<10;i++){
                result+=count[bitmask ^ (1<<i)];
            }
            count[bitmask]++;
        }
        return result;
    }
}