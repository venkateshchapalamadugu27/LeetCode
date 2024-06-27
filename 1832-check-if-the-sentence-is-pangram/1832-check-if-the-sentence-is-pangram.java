class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr=new int[26];
        for(char c:sentence.toCharArray()){
            int index=c-'a';
            arr[index]++;
        }
        
        for(int i=0;i<26;i++){
            if(arr[i]==0) return false;
        }
        return true;
    }
}