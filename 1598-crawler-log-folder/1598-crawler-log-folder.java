class Solution {
    public int minOperations(String[] logs) {
        int res=0;

        for(String s:logs){
           if(s.equals("../")){
            if(res>0){
                res--;
            }
           }
           else if(!s.equals("./")){
            res++;
           }
        }

        return res;
    }
}