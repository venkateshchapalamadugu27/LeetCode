/* 
     Here I initially converted all the string into numerical string.Then using recursion I calculated the sum.
     If condition k<=0 it comes out of the recursion. 
*/
class Solution {
    public int getLucky(String s, int k) {
        String t="";
        for(char c:s.toCharArray()){
            int num=c-'a'+1;
            t+=Integer.toString(num);
        }
        int res=calculate(t,k);
        return res;
    }

    private static int calculate(String t,int k){
        if(k==0){
            return Integer.parseInt(t);
        }
        int sum=0;
        for(char c:t.toCharArray()){
            sum+=Character.getNumericValue(c);
        }
        String n=Integer.toString(sum);
        return calculate(n,k-1);
    }
}