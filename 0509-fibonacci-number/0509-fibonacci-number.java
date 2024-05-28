class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int res=fib(n,dp);
        return res;
    }
    private static int fib(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        int fibn=fib(n-1,dp)+fib(n-2,dp);
        dp[n]=fibn;
        return fibn;
    }
}