class Solution {
    public int partitionString(String s) {
        String res="";
        int count=0;
        for(char c:s.toCharArray()){
            if(res.contains(String.valueOf(c))){
                count++;
                res=String.valueOf(c);
            }
            else{
                
                res+=c;
            }
        }
        return count+1;
    }
}