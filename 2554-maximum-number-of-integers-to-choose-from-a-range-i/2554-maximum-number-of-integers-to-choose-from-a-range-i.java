class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set=new HashSet<>();
        for(int num:banned){
            set.add(num);
        }
        int count=0,sum=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                count++;
                sum+=i;
                if(sum==maxSum){
                    return count;
                }
                if(sum>maxSum){
                    return count-1;
                }
            }
        }
        return count;
    }
}