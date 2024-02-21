class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
           String ns=Integer.toBinaryString(i);
           if(!s.contains(ns)){
               return false;
           }
        }
        return true;
    }
}