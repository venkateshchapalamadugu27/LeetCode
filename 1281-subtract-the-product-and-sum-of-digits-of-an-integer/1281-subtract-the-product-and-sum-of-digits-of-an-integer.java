class Solution {
    public int subtractProductAndSum(int n) {
        return product(n)-sum(n);
    }
    public static int product(int num){
        int prod=1;
        while(num>0){
            int rem=num%10;
            prod*=rem;
            num=num/10;
        }
        return prod;
    }
    public static int sum(int num){
        int prod=0;
        while(num>0){
            int rem=num%10;
            prod+=rem;
            num=num/10;
        }
        return prod;
    }
}