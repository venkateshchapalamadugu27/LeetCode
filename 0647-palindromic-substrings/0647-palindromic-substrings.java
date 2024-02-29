class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                count+=check(s.substring(i,j+1));
            }
        }
        return count+s.length();
    }
    private static int check(String t){
        int i=0;
        int j=t.length()-1;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}