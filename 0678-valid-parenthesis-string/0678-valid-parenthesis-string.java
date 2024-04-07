class Solution {
    public boolean checkValidString(String s) {
        int count=0,left=0,right=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                left++;
                right++;
            } 
            if(c==')'){
                left--;
                right--;
            }
            if(c=='*'){
               left++;
               right--;
            }
            if(left<0) return false;
            if(right<0) right=0;
        }
        return right==0;
    }
}