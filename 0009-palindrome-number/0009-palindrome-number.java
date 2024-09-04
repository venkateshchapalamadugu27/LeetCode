// java code
class Solution {
    public boolean isPalindrome(int x) {
        int rev=x;
        return x<0?false:positive(x,rev);
    }
    public boolean positive(int x,int rev){
        int num=0;
        while(x>0){
            int rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        return num==rev;
    }
}
