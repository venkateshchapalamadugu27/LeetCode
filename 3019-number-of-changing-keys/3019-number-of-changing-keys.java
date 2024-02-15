class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        s=s.toLowerCase();
        int l=s.length();
        int i=0;
        while(i<l-1){
            if(s.charAt(i)!=s.charAt(i+1)){
                count++;
            }
            i++;
        }
        
        return count;
    }
}