class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        if(costs[0]>coins) return 0;
        int total=0,i=0;
        for(int num:costs){
            if(coins-num >=0){
                total++;
                coins-=num;
            }
            else{
                return total;
            }
        }
        return total;
    }
}