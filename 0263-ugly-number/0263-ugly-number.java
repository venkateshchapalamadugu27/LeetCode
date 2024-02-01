
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int[] arr={2,3,5};
        for(int factor:arr){
            while(n%factor==0){
                n=n/factor;
            }
        }
        return n==1;
    }
}