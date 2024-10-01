class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] arr=new int[word.length()];
        long num=0;
        for(int i=0;i<word.length();i++){
            num=num*10+(word.charAt(i)-'0');
            if(num%m==0){
               arr[i]=1;
            }
            else{
                arr[i]=0;
            }
            num%=m;
        }
        return arr;
    }
}