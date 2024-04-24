class Solution {
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibo(n,dp);

    }
    private static int fibo(int n,int[] dp){
        if(n<0){
            return 0;
        }
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
            
        }
        int fibn=fibo(n-1,dp)+fibo(n-2,dp)+fibo(n-3,dp);
        dp[n]=fibn;
        return fibn;
    }
}