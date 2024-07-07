class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
       int emptyBottles=numBottles;
       while(emptyBottles>=numExchange){
           int avail=emptyBottles/numExchange;
           total+=avail;
           emptyBottles=avail + emptyBottles%numExchange;
       }
       return total;
    }
}