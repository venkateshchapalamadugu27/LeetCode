class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int num:rolls){
           sum+=num;
        }
        int remain=(mean*(n+rolls.length))-sum;

        if(remain>n*6 || remain<n) return new int[0];

        int[] result=new int[n];
        
        int quote=remain/(n);

        int rem=remain%(n);

        for(int i=0;i<(n);i++){
            result[i]=quote;
        };

        for(int i=0;i<rem;i++){
              result[i]++;
        }
        
        return result;

    }
}