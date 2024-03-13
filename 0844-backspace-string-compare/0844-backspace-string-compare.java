class Solution {
    public boolean backspaceCompare(String s, String t) {
        String first=filter(s);
        String second=filter(t);
        System.out.println(first);
        System.out.println(second);
        return first.equals(second);
    }
    private String filter(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){

            if(c == '#') {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
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