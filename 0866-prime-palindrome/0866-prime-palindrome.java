class Solution {
    public int primePalindrome(int n) {
        int num=n;
        while(n>0){
            if(isPrime(num) && isPalindrome(num)){
                return num;
            }
                num++;
                if (num > 10_000_000 && num< 100_000_000) {
                num = 100_000_000; 
                }
        }
        return num;
    }

    private boolean isPalindrome(int num){
        String s=Integer.toString(num);
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }

    private boolean isPrime(int a){
       if (a < 2) return false; 
    if (a == 2) return true; 
    if (a % 2 == 0) return false;
    for (int i = 3; i * i <= a; i += 2) {
        if (a % i == 0) {
            return false;
        }
    }
    return true;
    }
}