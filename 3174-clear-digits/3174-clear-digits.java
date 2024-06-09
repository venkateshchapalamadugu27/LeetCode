class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();

    }
}









/*
   1.initialize StringBuilder ans. 
   2.iterate over the given string .
   3. if current character is a number, delete last character of ans.
      3.1. if current character is not a number,append to the StringBuilder. 
*/