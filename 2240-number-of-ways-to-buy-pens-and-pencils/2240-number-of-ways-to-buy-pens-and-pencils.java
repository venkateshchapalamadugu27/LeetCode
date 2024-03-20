class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int max1=total/cost1;
        long count=0;
        for(int i=0;i<=max1;i++){
           int remainVal=total-(i*cost1);
           count=count+(remainVal/cost2+1);
        }
        return count;
    }
}