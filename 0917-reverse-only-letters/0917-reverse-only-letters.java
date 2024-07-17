class Solution {
    
    String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public String reverseOnlyLetters(String s) {
        int start=0,end=s.length()-1;
        char[] arr=s.toCharArray();
        while(start<end){
            if(isLetter(s.charAt(start)) && isLetter(s.charAt(end))){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;end--;
            }
            else if(!isLetter(s.charAt(start))){
                start++;
            }
            else if(!isLetter(s.charAt(end))){
                end--;
            }
        }
        
        return new String(arr);
    }
    
    private boolean isLetter(char c){
        return str.contains(String.valueOf(c));
    }
}