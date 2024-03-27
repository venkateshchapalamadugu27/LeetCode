class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0,right=(int)Math.sqrt(c);
        while(left<=right){
            long sum=right*right + left*left;
            if(sum==c){
                return true;
            }
            if(sum<c){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}