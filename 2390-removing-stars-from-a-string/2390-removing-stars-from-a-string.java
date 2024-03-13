class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else if(c == '*'){
                stack.pop();
            }
            else{
                stack.push(c);
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