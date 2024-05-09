class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        var answer=0L;
        Arrays.sort(happiness);
        for(var i=0;i<k;i++){
            answer+=Math.max(happiness[happiness.length-i-1]-i,0);
        }
        return answer;
    }
}