class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(stack.isEmpty() || stack.peek()!=c){
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty()){
           res.append(stack.pop());
        }
        res.reverse();
        return res.toString();
    }
}