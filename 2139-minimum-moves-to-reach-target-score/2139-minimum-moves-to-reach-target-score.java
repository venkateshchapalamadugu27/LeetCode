class Solution {
    public int minMoves(int target, int maxDoubles) {
        int result=0;
        while(target>1){
           if(maxDoubles>0 && target%2==0){
               result++;
               target = target/2;
               maxDoubles--;
           }
           else if(maxDoubles==0){
                result+=target-1;
                return result;
           }
           else{
               target--;
               result++;
           }
        }
        return result;
    }
}