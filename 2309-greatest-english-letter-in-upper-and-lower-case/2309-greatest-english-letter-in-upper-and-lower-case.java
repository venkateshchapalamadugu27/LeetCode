class Solution {
    public String greatestLetter(String s) {
        int result=-1;
        int[] cap=new int[26];
        int[] small=new int[26];
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                small[c-'a']++;
            }
            else{
                cap[c-'A']++;
            }
        }
        for(int i=0;i<26;i++){
            if(cap[i]>0 && small[i]>0){
                result=i;
            }
        }
        // System.out.println(Arrays.toString(cap));
        // System.out.println(Arrays.toString(small));
        // System.out.println(result);
    //    return Character.toString(result);
        if(result==-1)return "";
        char res=(char)('A'+result);
        return Character.toString(res);
    }
}