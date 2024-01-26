class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int n=0;
        while(num>0){
            int rem=num%10;
            n+=rem;
            num/=10;
        }
        return addDigits(n);
    }
}