class Solution {
    public int numberOfSpecialChars(String word) {
        int[] cap=new int[26];
        int[] small=new int[26];

        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c)){
                small[c-'a']++;
            }
            else{
               cap[c-'A']++;
            }
        }
        System.out.println(Arrays.toString(small));
        System.out.println(Arrays.toString(cap));
        int result=0;
        for(int i=0;i<26;i++){
           if(small[i]>0 && cap[i]>0){
            result++;
           }
        }
        return result;
    }
}