/* The possible three numbers are x-1,x,x+1.Their sum is 3x. 
   If given num is not divisible by 3 then there will be no consecutive numbers.
   If not the possible numbers are x-1,x,x+1 where 3x=num i.e., x=num/3.
*/
class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[]{};
        }
        long res=num/3;
        return new long[]{res-1,res,res+1};
    }
}