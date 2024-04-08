class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result=0;
        for(int i=0;i<tickets.length;i++){
           if(i<=k){
            result+=Math.min(tickets[k],tickets[i]);
           }
           else{
            result+=Math.min(tickets[k]-1,tickets[i]);
           }
        }
        return result;
    }
}