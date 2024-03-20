class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[]{};
        }
        long res=num/3;
        return new long[]{res-1,res,res+1};
    }
}