class Solution {
    public int longestPalindrome(String s) {
        char[] arr=new char[58];
        for(char c:s.toCharArray()){
            arr[c-'A']++;
        }
        int sum=0;
        boolean odd=false;
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            if(val%2==0){
                sum+=val;
            }
            else{
                sum+=val-1;
                odd=true;
            }
        }

        return sum+(odd ? 1:0);
    }
}