class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=x,sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return x%sum==0?sum:-1;
    }
}