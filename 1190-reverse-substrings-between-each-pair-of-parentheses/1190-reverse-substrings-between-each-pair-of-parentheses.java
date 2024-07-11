class Solution {
    public String reverseParentheses(String s) {

        StringBuilder sb=new StringBuilder(s);
        Stack<Integer> stack=new Stack();

        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='('){
                stack.push(i);
            }
            else if(sb.charAt(i)==')'){
                 int start=stack.pop();
                 reverse(sb,start+1,i-1);
            }
        }

        StringBuilder res=new StringBuilder();
        for(char c:sb.toString().toCharArray()){
            if(c!='(' && c!=')'){
                res.append(c);
            }
        }

        return res.toString();
    }

    void reverse(StringBuilder s,int start,int end){
       while(start<end){
         char temp=s.charAt(start);
         s.setCharAt(start,s.charAt(end));
         s.setCharAt(end,temp);
         start++;end--;
       }
    }
}