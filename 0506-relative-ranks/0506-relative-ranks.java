class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer=new String[score.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        int n=score.length ;
        Arrays.sort(score);
        for(int i=n-1;i>=0;i--){
            int index=map.get(score[i]);
            if (i == n - 1) {
                answer[index] = "Gold Medal";
            } else if (i == n - 2) {
                answer[index] = "Silver Medal";
            } else if (i == n - 3) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(n - i);
            }   }
        return answer;
    }
}